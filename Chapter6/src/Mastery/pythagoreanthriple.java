package Mastery;

public class pythagoreanthriple {

}
public class PythagoreanTriples {

    public static void main(String[] args) {
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                int c2 = a * a + b * b;
                if (perfectSquare(c2)) {
                    int c = (int) Math.sqrt(c2);
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }

    public static boolean perfectSquare(int n) {
        int r = (int) Math.sqrt(n);
        return r * r == n;
    }
} 
