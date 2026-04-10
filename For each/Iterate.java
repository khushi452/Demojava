import java.util.*;
import java.util.stream.*;

public class Iterate {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, n -> n + 1) // infinite stream
            .limit(10) // take first 10 elements
            .collect(Collectors.toList());

        System.out.println(list);
    }
}