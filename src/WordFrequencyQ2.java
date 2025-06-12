import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyQ2 {

    /*
    * Given a list of words, return a map with the frequency of each word.
    * */

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Long> wordsMap = words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        System.out.println(wordsMap);
    }

}
