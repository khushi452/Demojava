import java.util.*;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        Stream<Integer> strm = list.stream();
        Stream<Integer> data = strm.map(n-> n * n);
        data.forEach(n -> System.out.print(n + " "));
    }
}