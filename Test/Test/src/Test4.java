import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = new StringBuilder(a).reverse().toString();
        if (a.equals(b)) {
            System.out.println("Это полиндром");
        } else {
            System.out.println("Это не полиндром");
        }
    }
}