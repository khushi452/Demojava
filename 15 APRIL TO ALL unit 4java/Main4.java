import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Main4 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(15);
        list.add(30);
        list.add(50);
        System.out.println("List: " + list);
        list.remove(50);
        System.out.println("List after removing 50: " + list);
    }
}