class Sample implements Runnable {
    public void run() {
        
            System.out.println("Started"+Thread.currentThread().getName() );
            
            Thread.yield(); // give chance to other thread STATIC METHOS
            System.out.println("ENded"+Thread.currentThread());
    }
}


public class Main4 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Thread T1 = new Thread(s1,"Thread Name");
        Thread T2 = new Thread(s2,"Thread Name");
        T1.setPriority(4);
        T2.setPriority(10);
        T1.start();
        T2.start();
}



