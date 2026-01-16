package Mastery;

public class randomstats {

}
import java.util.Random;

public class RandomStats {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] count = new int[10];

        // generate 500 random numbers
        for (int i = 0; i < 500; i++) {
            int num = rand.nextInt(10); // 0 to 9
            count[num]++;
        }

        // print results
        System.out.println("Number\tOccurrences");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "\t" + count[i]);
        }
    }
}