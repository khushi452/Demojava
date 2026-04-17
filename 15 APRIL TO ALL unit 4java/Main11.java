import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main11 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        System.out.println("List: " + list1);

        list1.add(10);
        list1.add(20);
        list1.add(15);
        System.out.println("List: " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);

        list1.addAll(list2);
        System.out.println("After addAll: " + list1);

        list1.addAll(0, list2);
        System.out.println("After addAll at index 0: " + list1);

        // 🔹 get()
        System.out.println("Element at index 2: " + list1.get(2));

        // 🔹 isEmpty()
        System.out.println("Is the list empty? " + list1.isEmpty());

        // 🔹 size()
        System.out.println("Size of list: " + list1.size());

        // 🔹 contains()
        System.out.println("Does list contain 20? " + list1.contains(20));

        // 🔹 hashCode()
        System.out.println("HashCode of list: " + list1.hashCode());

        // 🔹 clear()
        list1.clear();
        System.out.println("After clear(): " + list1);

        // check again after clear
        System.out.println("Is list empty now? " + list1.isEmpty());
    }
}