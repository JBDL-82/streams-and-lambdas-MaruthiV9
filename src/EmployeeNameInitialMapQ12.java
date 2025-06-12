import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeNameInitialMapQ12 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 48000, "HR", 3),
                new Employee(102, "Andrew", 52000, "Engineering", 7),
                new Employee(103, "Bob", 75000, "Finance", 5),
                new Employee(104, "Bella", 60000, "Engineering", 2),
                new Employee(105, "Charlie", 47000, "HR", 6)
        );

        Map<Character, List<String>> employeeInitialMap = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getName().charAt(0),
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println(employeeInitialMap);
    }
}
