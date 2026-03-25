interface Sample2 {
    int add(int a, int b);
}

public class Main3 {
    public static void main(String[] args) {
        Sample2 S = (a, b) -> 
            a + b;

        System.out.println("Sum is " + S.add(5, 3));
    }
}