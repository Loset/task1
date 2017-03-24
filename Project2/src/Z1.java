import java.util.Scanner;

public class Z1 {

    static Printer printer = new PrinterFull();
    static EmployeeStorage employeeStorage = new ConsoleEmployeeStorage();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Firm firm = new Firm();
        while (true) {
            System.out.println("1 Заполнение");
            System.out.println("2 Вывод");
            System.out.println("3 Формат печати");
            System.out.println("4 Поиск");
            System.out.println("5 Сортировка");
            System.out.println("6 Выход");
            int n = in.nextInt();
            if (n == 1) {
                firm.setEmployees(employeeStorage.load());
            } else if (n == 2) {
                printer.print(firm.getEmployees());
            } else if (n == 3) {
                System.out.println("1 Полный список");
                System.out.println("2 Имя и фамилии");
                int type = in.nextInt();
                if (type == 1) {
                    printer = new PrinterFull();
                } else if (type == 2) {
                    printer = new PrinterMask();
                }
            } else if (n == 4) {
                System.out.println("Введите должность");
                in.nextLine();
                firm.search(in.nextLine());
            } else if (n == 5) {
                System.out.println("1 по фамилии");
                System.out.println("2 по зарплате");
                int typeSort = in.nextInt();
                firm.sort(typeSort);
            } else if (n == 6) {
                break;
            }
        }
    }
}
