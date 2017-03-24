import java.util.Scanner;

public class T21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a[] = new boolean[100];
        for (int i = 2; i*i < 100; i++) {
            if (!a[i]) {
                for (int j = i*i; j < 100; j += i) {
                    a[j] = true;
                }
            }
        }
        for (int i = 2; i < 100; i++) {
            if (!a[i]) {
                System.out.print(i + " ");
            }
        }
    }
}