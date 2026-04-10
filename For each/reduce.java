import java.util.*;


public class reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
            .filter(n -> n % 2 != 0) // filter odd numbers
            .reduce(0, (a, b) -> a + b); // reduce to sum

        System.out.println("Sum: " + sum);
    }
    
}
