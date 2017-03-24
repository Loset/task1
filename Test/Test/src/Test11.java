import java.util.Scanner;
import java.util.Random;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Random rnd = new Random(System.currentTimeMillis());
        int number = a + rnd.nextInt(b - a + 1);
        System.out.print(number);
    }
}