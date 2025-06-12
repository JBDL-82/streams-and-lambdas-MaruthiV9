import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DepartmentswithNoEmployeesQ11 {

    public static void main(String[] args) {
        List<String> departments = Arrays.asList("HR", "Engineering", "Finance", "Marketing", "Sales");

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 48000, "HR", 3),
                new Employee(102, "Bob", 52000, "Engineering", 7),
                new Employee(103, "Charlie", 75000, "Finance", 5),
                new Employee(104, "Diana", 60000, "Engineering", 2)
        );

        Set<String> employeeSet = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());

        System.out.println("Departments with No Employees ");
        departments.stream()
                .filter(d -> !employeeSet.contains(d))
                .forEach(System.out::println);

    }
}
