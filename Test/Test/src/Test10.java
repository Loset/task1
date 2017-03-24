import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);;
        BigInteger c = BigInteger.valueOf(0);
        System.out.print("0 1 ");
        int i = 1;
        while (i++ < n - 1) {
            c = a.add(b);
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}