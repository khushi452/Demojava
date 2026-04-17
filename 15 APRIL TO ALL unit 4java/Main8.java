import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main8
 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//wrapper class integer we can use linkedlist arraylist 
        System.out.println("List: " + list);    
        list.add(10);
        list.add(20);           
        list.add(15);
        System.out.println("List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list   );
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reversed List: " + list);
    }
    
}
