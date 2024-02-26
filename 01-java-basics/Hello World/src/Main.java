
public class Main {

   public static void main(String[] args) {
      String greeting = "Hello, World";
      int a = addQuestionMark(greeting.toLowerCase());
      System.out.println(a^2);
   }

   public static int addQuestionMark(String s){
      System.out.println(s + "?");
      return s.length();
   }
}
