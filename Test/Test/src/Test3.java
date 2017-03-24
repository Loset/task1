import java.util.Scanner;

public class Test3 {
    public static void check(double a) {
        if (a % 1 == 0) {
            System.out.println("Целое");
//            return true;
        } else {
            System.out.println("Не целое");
//            return false;
        }
    }
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        check(sum);
        System.out.println(sum);
    }
}