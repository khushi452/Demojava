class abstract class A{
    abstract void display();
}
class concreteClass extends A{
    void display(){
        System.out.println("This is concrete class");
    }
}


class Example {
    void display(){
        System.out.println("This is class Example");
    }
}

class Test extends Example{
    void display(){
        System.out.println("This is class Test");}
}
public class Main8 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
    }
}