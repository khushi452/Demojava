class Parent {

    void display() {
        System.out.println("Parent show method");
    }

    static void show() {
        System.out.println("Parent static display method");
    }
}

class Child extends Parent {

    void display() {
        System.out.println("Child show method");
    }
    static void show() {
        System.out.println("Child static display method");
    }
}

public class Main19 {
    public static void main(String[] args) {

        Parent p = new Child();
        p.show();       
        p.display();  
    }
}