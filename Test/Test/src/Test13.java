import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class Test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int number = (int)'a' + rnd.nextInt((int)'z' - 'a' + 1);
        while (true) {
            String a = in.nextLine();
            int b = (int)a.charAt(0);
            if (b == number) {
                System.out.print("Right\n");
                break;
            } else if (b > number) {
                System.out.print("low\n");
            } else {
                System.out.print("High\n");
            }
        }
    }
}