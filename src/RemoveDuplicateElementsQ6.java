import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElementsQ6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1, 6);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

    }

}
