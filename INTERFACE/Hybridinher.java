class A{
    void show(){
        System.out.println("This is class A");
    }
}
interface B{
    void show();
}
interface C{
    void show();
}
class D extends A implements B,C{
    public void show(){
        System.out.println("This is class D");
    }
}

public class Hybridinher {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}
