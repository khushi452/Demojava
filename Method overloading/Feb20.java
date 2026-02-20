class Parent {

    String name;

    Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor Called");
    }

    void display() {
        System.out.println("Parent Name: " + name);
    }
}

class Child extends Parent {

    int age;

    Child(String name, int age) {
        super(name);   // calling parent constructor
        this.age = age;
        System.out.println("Child Constructor Called");
    }

    void show() {
        System.out.println("Age: " + age);
    }
}

public class Feb20 {
    public static void main(String[] args) {

        Child obj = new Child("Julie", 20);

        obj.display();
        obj.show();
    }
}