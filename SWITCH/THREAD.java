
class Class1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.print(i);

    }
}


class Class2 implements Runnable{
    public void run()
    {
        for(char i='A';i<='E';i++)
            System.out.println(i);
    }
    
}

public class  THREAD{
    public static void main(String[] args) {
        Class1 T1= new Class1();
        Class2 C1=new Class2();
        Thread T2= new Thread(C1);
        T1.start();
        T2.start();

    }
    
}
