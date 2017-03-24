import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double c = n - (0.17 * n);
        System.out.println(c);
    }
}