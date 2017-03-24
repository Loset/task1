import java.util.Scanner;

public class Test18 {
    public static void triangle(int a, int b, int c) {
        if (a*a == b*b + c*c) {
            System.out.println("Прямоугольный");
        } else if (a*a < b*b + c*c) {
            System.out.println("Остроугольный");
        } else {
            System.out.println("Тупоугольный");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int h;
        if ((a + b > c) && (a + c > b) && (c + b > a) &&
                (a > 0) && (b > 0) && (b > 0)) {
            if ((a > b) && (a > c)) {
                triangle(a, b, c);
            } else if ((b > a) && (b > c)) {
                triangle(b, a, c);
            } else {
                triangle(c, b, a);
            }
        } else {
            System.out.println("Треугольник не возможен");
        }
    }
}