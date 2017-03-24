import java.util.List;

public class PrinterFull implements Printer {

    @Override
    public void print(List<Employee> employees) {
        int i = 1;
        for (Employee employee : employees) {
            System.out.println("Сотрудник № " + i++);
            System.out.println("    Фамилия: " + employee.surname);
            System.out.println("    Имя: " + employee.name);
            System.out.println("    Должность: " + employee.position);
            System.out.println("    Зарплата: " + employee.salary);
        }
    }
}
