import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDepartmentQ8 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "A", 48000, "HR", 3),
                new Employee(102, "B", 52000, "Engineering", 7),
                new Employee(103, "C", 75000, "Finance", 5),
                new Employee(104, "D", 60000, "Engineering", 2),
                new Employee(105, "E", 47000, "HR", 6)
        );

        Map<String, Double> averageSalariesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalariesByDepartment);
    }
}
