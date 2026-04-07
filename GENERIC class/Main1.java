class Example1<Ta, Tb> {
    void display(Ta a, Tb b) {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main1 {
    public static void main(String[] args) {

        // Integer + String
        Example1<Integer, String> E1 = new Example1<>();
        E1.display(10, "Hello");

        // String + Float
        Example1<String, Float> E2 = new Example1<>();
        E2.display("Khushi", 3.4f);
    }
}