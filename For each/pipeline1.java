import java.util.*;

public class pipeline1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);

        list.stream()
            .sorted()   // sort only
            .forEach(n -> System.out.print(n + " "));
    }
}