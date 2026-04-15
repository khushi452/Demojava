import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("List: " + list);
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(50);
        list.add(60);
        System.out.println("List after adding elements: " + list);
        Spliterator<Integer> SP1 = list.spliterator();
        Spliterator<Integer> SP2 = SP1.trySplit();
        // SP.tryAdvance(n->System.out.println(n + " "));
        // System.out.println("Remaining elements: ");
        // SP.forEachRemaining(n->System.out.println(n + " "));
        System.out.println("First half: ");
        SP1.forEachRemaining(n->System.out.println(n + " "));
        System.out.println("Second half: ");
        SP2.forEachRemaining(n->System.out.println(n + " "));
    }
    
}
