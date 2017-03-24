import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a + "/" + b + " = " + (a/b) + " и " + (a%b) +  " в остатке");
    }
}
