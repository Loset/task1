import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int count = 0;
        for (int i = 1; i < 50001; i++) {
            str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '2') {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}