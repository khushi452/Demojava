import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Main3 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(15);
        list.add(30);
        list.add(50);
        System.out.println("List: " + list);
        System.out.println("Enhanced for each loop: ");
        for(Integer i : list) {
            System.out.println(i+ " ");

        }
        System.out.println("For each method: ");
        list.forEach(n-> System.out.println(n + " "));
        System.out.println("Iterator interface: ");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

    }
    
}
