interface I1{
    int r =2;
    String name ="khushi";
}
interface I2 extends I1{
    void display();
}


public class Program1 implements I2{
    public void display(){
        System.out.println("The value of r is "+r);
        System.out.println("The name is "+name);
    }
    public static void main(String[] args) {
        Program1 p = new Program1();
        p.display();
        System.out.println(Program1.r)//class variable will be executed by interface or class method will be executed by class method.
    }

    
}
