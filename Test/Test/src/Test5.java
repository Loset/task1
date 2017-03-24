import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum = sum + (int) n.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}