import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterable<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // //enhanced for each loop
        // for(Integer i : list) {
        //     System.out.println(i+ " ");
        // }
        // // //for each method
        // list.forEach(n-> System.out.println(n + " "))
        // iterator interface;
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
