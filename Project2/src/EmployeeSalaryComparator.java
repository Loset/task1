import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.salary - b.salary;
    }
}
