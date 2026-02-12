class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("woof");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.eat();
        D.bark();

        System.out.println("Cat");
        Cat C = new Cat();
        C.meow();
        C.eat();
    }

    
}
