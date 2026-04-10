import java.util.*;


public class Findany {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arjun", "khushi", "Alice", "Bob", "Charlie");
        Optional<String> names = list.stream()
            .filter(name -> name.startsWith("A")) // filter names starting with 'A'
            .findAny();
            System.out.println((names.get()));
    }
}