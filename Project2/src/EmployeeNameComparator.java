import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.surname.compareTo(b.surname);
    }
}
