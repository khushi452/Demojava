class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {

    int age;

    Dog(String name, int age) {   // constructor of child class
        super(name);              // calling parent constructor
        this.age = age;
    }

    void show() {
        System.out.println("Dog Age: " + age);
        System.out.println("Dog Name: " + name);
    }
}

public class Main6 {

    public static void main(String[] args) {

        Dog d = new Dog("Buddy", 5);  // object of Dog

        d.show();
        System.out.println();
        d.display();   // calling parent method
    }
}