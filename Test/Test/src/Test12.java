import java.util.Scanner;
import java.util.Random;

public class Test12 {
    public static void writeArr(double a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double a[] = new double[100];
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(10);
        }
        while (true) {
            System.out.print("1 Вывести масив\n");
            System.out.print("2 Увеличить элемент на 10%\n");
            System.out.print("3 Выход\n");
            int m = in.nextInt();
            if (m == 1) {
                writeArr(a, n);
            } else if (m == 2) {
                System.out.print("Введите номер элемент\n");
                int k = in.nextInt();
                a[k] = a[k] + (a[k] / 10);
            } else if (m == 3) {
                break;
            }
        }
    }
}