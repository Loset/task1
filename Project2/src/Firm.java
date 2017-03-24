import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Firm {
    private List<Employee> employees = new LinkedList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void search(String position) {
        int i = 1;
        boolean notPosition = true;
        for (Employee human : employees) {
            if (human.position.equals(position)) {
                System.out.println("Сотрудник № " + i++);
                System.out.println("    Фамилия: " + human.surname);
                System.out.println("    Имя: " + human.name);
                notPosition = false;
            }
        }
        if (notPosition) {
            System.out.println("Нет такой должности");
        }
    }
    public void sort(int typeSort) {
        if (typeSort == 1) {
            employees.sort(new EmployeeNameComparator());
        } else if(typeSort == 2) {
            employees.sort(new EmployeeSalaryComparator());
        }
    }
}
