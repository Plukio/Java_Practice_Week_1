import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AuthorizationHandlerTest {
  private final AuthorizationHandler authHandler = new AuthorizationHandler();
  private final String validUsername = "user";
  private final String validPassword = "secret";
  private final String invalidPassword = "invalid";



  @Test
  @DisplayName("testAuthorizeSuccess")
  public void testAuthorizeSuccess() {
    authHandler.authorize(validUsername, validPassword);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, authHandler.getStatus(), "actual " + authHandler.getStatus() + " expected " + AuthorizationHandler.Status.AUTHORIZED);
  }

  @Test
  @DisplayName("testAuthorizeFailOnce")
  public void testAuthorizeFailOnce() {
    authHandler.authorize(validUsername, invalidPassword);
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, authHandler.getStatus(), "actual " + authHandler.getStatus() + " expected " + AuthorizationHandler.Status.UNAUTHORIZED);
  }

  @Test
  @DisplayName("testAuthorizeFailThreeTimes")
  public void testAuthorizeFailThreeTimes() {
    for (int i = 0; i < 3; i++) {
      authHandler.authorize(validUsername, invalidPassword);
    }
    Assertions.assertEquals(AuthorizationHandler.Status.LOCKED, authHandler.getStatus(), "actual " + authHandler.getStatus() + " expected " + AuthorizationHandler.Status.LOCKED);
  }

  @Test
  @DisplayName("testAuthorizeAfterTwoFails")
  public void testAuthorizeAfterTwoFails() {
    for (int i = 0; i < 2; i++) {
      authHandler.authorize(validUsername, invalidPassword);
    }
    authHandler.authorize(validUsername, validPassword);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, authHandler.getStatus(), "actual " + authHandler.getStatus() + " expected " + AuthorizationHandler.Status.AUTHORIZED);
  }

  @Test
  @DisplayName("testUnAuthorizeWhenUnauthorized")
  public void testUnAuthorizeWhenAuthorized() {
    authHandler.authorize(validUsername, validPassword);
    authHandler.unAuthorize();
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, authHandler.getStatus(), "actual " + authHandler.getStatus() + " expected " + AuthorizationHandler.Status.UNAUTHORIZED);
  }


  @Test
  @DisplayName("testUnAuthorizeWhenLocked")
  public void testUnAuthorizeWhenLocked() {
    for (int i = 0; i < 3; i++) {
      authHandler.authorize(validUsername, invalidPassword);
    }
    authHandler.unAuthorize();
    Assertions.assertEquals(AuthorizationHandler.Status.LOCKED, authHandler.getStatus(), "actual " + authHandler.getStatus() + " expected " + AuthorizationHandler.Status.LOCKED);}

  @Test
  @DisplayName("testAuthorizeWhenAuthorizeResetCount")
  public void testAuthorizeWhenAuthorizeResetCount() {

    for (int i = 0; i < 2; i++) {
      authHandler.authorize(validUsername, invalidPassword);
    }
    authHandler.authorize(validUsername, validPassword);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, authHandler.getStatus());

    for (int i = 0; i < 2; i++) {
      authHandler.authorize(validUsername, invalidPassword);
    }
    authHandler.authorize(validUsername, validPassword);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, authHandler.getStatus());
  }

}
