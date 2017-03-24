import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class Test16 {
    public static void writeArr(double a[][]) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int[][] a = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                a[i][j] = rnd.nextInt(10);
            }
        }

        show(a);
        System.out.println();
        int max = -1;
        int index = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    index = j;
                }
            }
            max = a[i][0];
            a[i][0] = a[i][index];
            a[i][index] = max;
            max = -1;
        }
        show(a);
    }

    private static void show(int[][] a) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}