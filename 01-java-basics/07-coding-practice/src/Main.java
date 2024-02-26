import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {

      double[][] temperatures = Data.temperatures;

      ArrayList<String> weekdays = new ArrayList<String>();


      weekdays.add("Monday");
      weekdays.add("Tuesday");
      weekdays.add("Wednesday");
      weekdays.add("Thursday");
      weekdays.add("Friday");
      weekdays.add("Saturday");
      weekdays.add("Sunday");

      for (int i = 0; i < temperatures.length; i += 1){
         float weather = getWeather(temperatures[i]);
         System.out.println(weekdays.get(i % 7) + ": " + weather);

      }
   }
   public static float getWeather(double[] temp) {
      int j = 0;
      double sum = 0;
      for (int i = 0; i < temp.length; i += 1){
         double a = temp[i];
         if (a >= -45.0 && a <= 45.0){
            j += 1;
            sum += a;
         }

      }
      return (float) (sum / j);
   }

}
