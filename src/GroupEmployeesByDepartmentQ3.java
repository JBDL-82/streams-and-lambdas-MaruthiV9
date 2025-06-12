import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartmentQ3 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "A", 48000, "HR", 3),
                new Employee(102, "B", 52000, "Engineering", 3),
                new Employee(103, "C", 50000, "Finance", 3),
                new Employee(104, "D", 60000, "Engineering", 5),
                new Employee(105, "E", 47000, "HR", 4),
                new Employee(106, "F", 51000, "Finance", 4)
        );

        Map<String, List<Employee>> groupedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println( "Employees Grouped by Departments: "+ groupedEmployees);


    }
}
