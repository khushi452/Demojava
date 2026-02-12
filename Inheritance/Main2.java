class A{
    void methodA(){
        System.out.println("I am methodA() of class A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("I am methodB() of class B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("I am methodC() of class C");
    }
}


public class Main2 {
    public static void main(String[] args) {
        C C1 = new C();
        
        C1.methodC();
        C1.methodB();
        C1.methodA();
    }
}
