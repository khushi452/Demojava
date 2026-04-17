import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main10
 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();//wrapper class integer we can use linkedlist arraylist 
        System.out.println("List: " + list1);    
        list1.add(10);
        list1.add(20);           
        list1.add(15);
        System.out.println("List: " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200); 
        list1.addAll(list2);
        System.out.println("List after adding all elements from list2: " + list1);
        list1.addAll(0,list2);
        System.out.println("List after adding all elements from list2 at index 0: " + list1);
        System.out.println("Element at index 2: " + list1.get(2));
        System.out.println("Is the list empty? " + list1.isEmpty());
    }
    
}
