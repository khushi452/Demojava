class Parent{
    void display(){
        System.out.println("I am display() of Parent class");

    }
}

class Child extends Parent{
    void show(){
        System.out.println("I am show() of Child class");
    }   
}

public class Main {
    public static void main(String[] args) {
   Parent p = new Parent();
   p.display();
   Child C = new Child();
   C.show();
    }
}