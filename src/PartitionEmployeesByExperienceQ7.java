import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesByExperienceQ7 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 48000, "HR", 3),
                new Employee(102, "Bob", 52000, "Engineering", 7),
                new Employee(103, "Charlie", 75000, "Finance", 5),
                new Employee(104, "Diana", 60000, "Engineering", 2),
                new Employee(105, "Eve", 47000, "HR", 6)
        );

        Map<Boolean, List<Employee>> collect = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getExperience() >= 5));

        System.out.println("Employees with experience >= 5:" + collect.get(true));
        System.out.println("Employees with experience < 5:" + collect.get(false));


    }
}
