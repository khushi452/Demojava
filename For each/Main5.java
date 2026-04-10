import java.util.*;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);

        Stream<Integer> s = list.stream();
        long len = s.count();

        // Create new stream again
        list.stream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nLength of stream is " + len);
    }
}