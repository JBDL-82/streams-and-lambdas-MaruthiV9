import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringswithCommaQ5 {

    /*
    * Join all strings in a list using a comma as a delimiter.
    Input: ["Java", "Python", "C++"]
    Output: "Java,Python,C++"
    *
    * */

    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "Python", "C++");

        String name = langs.stream()
                .collect(Collectors.joining(","));

        System.out.println(name);
    }
}