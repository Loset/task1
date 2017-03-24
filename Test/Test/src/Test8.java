import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean simple = true;
        for (int i = 1; i < (n / 2 + 1); i++) {
            if (n % i == 0) {
                System.out.println("Число не простое");
                simple = false;
                break;
            }
        }
        if (simple) {
            System.out.println("Число простое");
        }
    }
}