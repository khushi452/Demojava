interface Example{
    int n = 10;
    void display();
}

class Sample implements Example{
    public void display(){
        System.out.println("Value of n is: " + n);
    }
   
}

public class Main{
    public static void main(String[] args) {
        Sample s = new Sample();
        s.display();
    }

}