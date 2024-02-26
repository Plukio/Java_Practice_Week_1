import java.util.ArrayList;

public class WindDataTask {

   public static void main(String[] args) {

      short sensorValue = 773; // 00000011 00000101
      String bit = Integer.toBinaryString(sensorValue);
      int direction = sensorValue >> 8;
      int speed = sensorValue & 255;

      System.out.println("Wind speed: " + speed);
      System.out.println("Wind direction: " + direction);
   }

   public static ArrayList<Integer> findWindVector(int num){
      ArrayList<Integer> binary = new ArrayList<Integer>();
      int direction = 0;
      int speed = 0;

      for (int i = 15; i >= 0; i -= 1){
         int power = (int) Math.pow(2, i);
         int rest = num / power;

         if (i >= 8 && rest == 1){
            int a = (int) Math.pow(2, i % 8);
            direction += a;
         }
         if (i < 8 && rest == 1){
            int b = (int) Math.pow(2, i % 8);
            speed +=  b;
         }
         num -= power * rest;

      }

      binary.add(direction);
      binary.add(speed);
      return binary;
   }

}
