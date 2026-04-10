import java .util.*;   
import java.util.stream.Stream; 


public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        Stream<Integer> s = list.stream();
        s.forEach(n -> System.out.println(n+" "));
    }
    
}
