import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iterable<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for(Integer i : list) {
            System.out.println(i+ " ");
        }
    }
}
