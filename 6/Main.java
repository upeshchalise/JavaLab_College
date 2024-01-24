/**
 * Main
 * 5. Create two threads, one thread to
 *  display 1 to 50 and another thread to
 *  display 100 to 50.
 *  Assign maximum priority to the first thread
 *  and minimum priority to the second thread.*/

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("Thread 1 : " + i);
            }

        });
        t1.setPriority(10);
        
        Thread t2 = new Thread(() -> {
            for (int i = 100; i >=50;i--) {
                System.out.println("Thread 2 : " + i);
            }
        });
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}