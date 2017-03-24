import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = b*b - 4*a*c;
        if (d < 0) {
            System.out.print("Корней нет");
        } else if (d == 0){
            System.out.print( (-b) / (2*a) );
        } else {
            System.out.println( (-b + Math.sqrt(d)) / (2*a));
            System.out.print( (-b - Math.sqrt(d)) / (2*a));
        }
    }
}