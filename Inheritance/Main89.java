class Parent {
    static void static1() {
        System.out.println("Parent Static 1");
    }

    static void static2() {
        System.out.println("Parent Static 2");
    }

    void normal() {
        System.out.println("Parent Normal Method");
    }
}

class Child extends Parent {
    static void static1() {
        System.out.println("Child Static 1");
    }

    static void static2() {
        System.out.println("Child Static 2");
    }

   
    void normal() {
        System.out.println("Child Normal Method");
    }
}

public class Main89 {
    public static void main(String[] args) {
        Parent obj = new Child();

        Parent.static1();
        Parent.static2();

        Child.static1();
        Child.static2();

        obj.normal();
    }
}
