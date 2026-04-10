import java.util.*;
import java.util.stream.Collectors;

public class filter1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arjun", "khushi", "Alice", "Bob", "Charlie");

        List<String> res = list.stream()
            .filter(name -> name.startsWith("A")) // filter names starting with 'A'
            .map(String::toUpperCase) // capitalize first letter
            .collect(Collectors.toList());

        System.out.println(res);
    }
}