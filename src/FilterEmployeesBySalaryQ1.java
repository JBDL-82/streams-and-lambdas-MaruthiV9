import java.util.Arrays;
import java.util.List;

public class FilterEmployeesBySalaryQ1 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "A", 48000, "HR", 3),
                new Employee(102, "B", 56000, "Engineering",2),
                new Employee(103, "C", 52000, "Finance",3),
                new Employee(104, "D", 60000, "Engineering", 6),
                new Employee(105, "E", 47000, "Marketing", 5)
        );

        employees.stream()
                .filter( e -> e.getSalary() > 50000)
                .forEach(System.out::println);
    }
}
