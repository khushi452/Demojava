import java.util.List;
import java.util.ArrayList;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//wrapper class integer we can use linkedlist arraylist 
        System.out.println("List: " + list);    
        list.add(10);
        list.add(20);           
        list.add(15);
        System.out.println("List: " + list);
        Integer[] arr = list.toArray(new Integer[0]);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
    
}
