package Mastery;

public class primenumberchecker {

}
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Part A
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        } 
        
        // Part B
        System.out.print("Enter first number: ");
        int start = input.nextInt();

        System.out.print("Enter second number: ");
        int end = input.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}

