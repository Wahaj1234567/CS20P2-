package Mastery;
import java.util.Scanner;

public class ObjectHeight {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter a time less than 4.5 seconds:");
      double t = s.nextDouble();

      double h = 100 - 4.9 * t;

      System.out.println("The height of the object is: " + h + " meters");
   }
} 