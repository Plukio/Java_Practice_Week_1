import java.util.ArrayList;

public class Main {

   private static final String freezing = "freezing cold";
   private static final String cold = "cold";
   private static final String nice = "nice";
   private static final String warm = "warm";
   private static final String hot = "hot";
   private static final double[] temperatures = Data.temperature; // array of temperatures values

   private static ArrayList<String> weekdays = new ArrayList<String>();




   public static void main(String[] args) {
      weekdays.add("Monday");
      weekdays.add("Tuesday");
      weekdays.add("Wednesday");
      weekdays.add("Thursday");
      weekdays.add("Friday");
      weekdays.add("Saturday");
      weekdays.add("Sunday");

      for (int i = 0; i < temperatures.length; i += 1){
         String weather = getWeather(temperatures[i]);
         System.out.println(weekdays.get(i % 7) + ": it's a " + weather + " day!");

      }

   }
   public static String getWeather(double temp) {
      if(temp < 0){
         return freezing;
      }
      else if(temp >= 0 && temp <= 10){
         return cold;
      }
      else if(temp > 10 && temp <= 20){
         return nice;
      }
      else if(temp > 20 && temp <= 25){
         return warm;
      }
      else{
         return hot;
      }
   }
}
