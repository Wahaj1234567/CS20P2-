package Mastery;

public class PIGGYBANK {

}
import java.util.Scanner;

class PiggyBank {
    private int totalCents;

    public PiggyBank() {
        totalCents = 0;
    }

    public void addPenny() {
        totalCents += 1;
    }

    public void addNickel() {
        totalCents += 5;
    }

    public void addDime() {
        totalCents += 10;
    }

    public void addQuarter() {
        totalCents += 25;
    }

    public void takeOutMoney() {
        totalCents = 0;
    }

    public double getTotal() {
        return totalCents / 100.0;
    }
}

public class MySavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();
        int choice;

        do {
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Total: $" + bank.getTotal());
            } else if (choice == 2) {
                bank.addPenny();
            } else if (choice == 3) {
                bank.addNickel();
            } else if (choice == 4) {
                bank.addDime();
            } else if (choice == 5) {
                bank.addQuarter();
            } else if (choice == 6) {
                bank.takeOutMoney();
            }

        } while (choice != 0);

        input.close();
    }
}