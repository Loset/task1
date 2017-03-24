import java.util.Scanner;

public class Test19 {
    public static void number(int a) {
        if (a < 100) {
            if (a < 50) {
                if (a < 10) {
                    if (a < 5) {
                        if (a < 4) {
                            if (a < 3) {
                                if (a == 1) {
                                    System.out.print("I");
                                } else {
                                    if (a == 2) {
                                        System.out.print("II");
                                    }
                                }
                            } else {
                                System.out.print("III");
                            }
                        } else {
                            System.out.print("IV");
                        }
                    } else {
                        if (a == 9) {
                            System.out.print("IX");
                        } else if (a == 8) {
                            System.out.print("IIX");
                        } else {
                            System.out.print("V");
                            number(a - 5);
                        }
                    }
                } else {
                    if (a >= 40) {
                        System.out.print("XL");
                        number(a - 40);
                    } else {
                        System.out.print("X");
                        number(a - 10);
                    }
                }
            } else {
                if (a >= 90) {
                    System.out.print("XC");
                    number(a - 90);
                } else {
                    System.out.print("L");
                    number(a - 50);
                }
            }
        } else {
            System.out.println("C");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        number(a);
    }
}