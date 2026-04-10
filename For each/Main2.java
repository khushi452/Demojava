
import java.util.*;
import java.util.function.Consumer;



public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);//fixed size of array in the arrays
        System.out.println(list);
        Consumer<Integer> obj = new Consumer<>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };

        
        list.forEach(obj);  
    }
}
