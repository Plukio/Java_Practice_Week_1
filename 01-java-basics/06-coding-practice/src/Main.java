public class Main {

   public static void main(String[] args) {

      double[] windSpeed = Data.windSpeed;
      byte[] winDirection = Data.winDirection;


      float averageWindSpeed = getMeanWindSpeed(windSpeed);
      int averageWindDirection = getMeanWinDirection(winDirection);
/*
 your code
 */

      System.out.println("Average wind speed: " + averageWindSpeed);
      System.out.println("Average wind direction: " + averageWindDirection);
   }

   public static float getMeanWindSpeed(double[] windSpeed) {
      double a = 0;
      for (int i = 0; i < windSpeed.length; i += 1){
         a += windSpeed[i];
      }

      float speed = (float) (a /windSpeed.length);
      return (float) (speed);
   }

   public static int getMeanWinDirection(byte[] windDirection) {
      int b = 0;
      for (int i = 0; i < windDirection.length; i += 1){
         b += windDirection[i];
      }

      int direction = b / windDirection.length;

      return direction;

   }

}
