final class A{
   void display(){
        System.out.println("This is class A");
    }
}

class B extends A{
   void display(){
        System.out.println("This is class B");
    }

}



public class Main7 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.display(); // Call the display method of class B
    }
    
}
