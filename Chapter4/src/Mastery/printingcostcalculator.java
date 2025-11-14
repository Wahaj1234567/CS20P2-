package Mastery;

public class printingcostcalculator {

}
import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of copies to be printed: ");
        int copies = input.nextInt();
        double price;

        if (copies >= 0 && copies <= 99) {
            price = 0.30;
        } else if (copies >= 100 && copies <= 499) {
            price = 0.28;
        } else if (copies >= 500 && copies <= 749) {
            price = 0.27;
        } else if (copies >= 750 && copies <= 1000) {
            price = 0.26;
        } else {
            price = 0.25;
        }

        double total = copies * price;

        System.out.println("Price per copy is: $" + price);
        System.out.println("Total cost is: $" + String.format("%.2f", total));
    }
}