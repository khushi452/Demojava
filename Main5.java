
class Staticexample {
    void normal() {
        System.out.println("This is a normal method");
    }

    static void display() {
        show();
        System.out.println("This is a static method");
    }

    static void show() {
        System.out.println("This is another static method");
    }  
}
public class Main5 {
    public static void main(String[] args) {
        Staticexample SE = new Staticexample();
        // SE.normal();
        Staticexample.display();
        Staticexample.show();

    }
}
