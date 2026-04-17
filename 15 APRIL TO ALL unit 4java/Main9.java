import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main9
 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//wrapper class integer we can use linkedlist arraylist 
        System.out.println("List: " + list);    
        list.add(10);
        list.add(20);           
        list.add(15);
        System.out.println("List: " + list);
        list.add(1,333333);
        System.out.println("List: " + list);
        list.set(2, 1000);
        System.out.println("List: " + list);
         
    }
    
}
