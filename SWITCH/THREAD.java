class Class1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
    }
}

class Class2 implements Runnable {
    public void run() {
        for (char i = 'A'; i <= 'E'; i++) {
            System.out.print(i);
        }
    }
}

public class THREAD {
    public static void main(String[] args) {

        Class1 T1 = new Class1();
        Class2 C1 = new Class2();

        Thread T2 = new Thread(C1, "Thread two");

        // Setting priorities (optional)
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        T1.start();
        T2.start();

        try {
            // Wait for both threads to finish
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("\nMain thread finished");
    }
}