import java.util.List;

public class PrinterMask implements Printer {

    @Override
    public void print(List<Employee> employees) {
        int i = 1;
        for (Employee employee : employees) {
            System.out.println("Сотрудник № " + i++);
            System.out.println("    Фамилия: " + employee.surname);
            System.out.println("    Имя: " + employee.name);
        }
    }
}
