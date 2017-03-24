import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student7 on 22.02.2017.
 */
public class ConsoleEmployeeStorage implements EmployeeStorage {

    @Override
    public List<Employee> load() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество человек");
        List<Employee> employees = new LinkedList<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите фамилию");
            String surName = in.nextLine();
            System.out.println("Введите имя");
            String name = in.nextLine();
            System.out.println("Введите должность");
            String position = in.nextLine();
            System.out.println("Введите зарплату");
            int salary = in.nextInt();
            employees.add(new Employee(surName, name, position, salary));
            in.nextLine();
        }
        return employees;
    }
}
