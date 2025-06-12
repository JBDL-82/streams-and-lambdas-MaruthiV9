import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeewithMaxSalaryQ4 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "A", 48000, "HR",2),
                new Employee(102, "B", 52000, "Engineering", 2),
                new Employee(103, "C", 50000, "Finance",4),
                new Employee(104, "D", 60000, "Engineering",6),
                new Employee(105, "E", 47000, "HR",5),
                new Employee(106, "F", 51000, "Finance",4)
        );

        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(e -> System.out.println("Employee with maximum salary: " + e));
    }
}
