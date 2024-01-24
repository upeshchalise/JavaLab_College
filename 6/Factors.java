
/**
 * Factors
 *
 *
 * 2. Create two threads, the first thread should display the factors of 20 in the interval of 1
 * second and second thread should display the factors of 25 in the interval of 1 and half second.
 */
public class Factors {

    public static void main(String[] args) {
        new Thread(() -> {
            factors(20, 1000);
        }).start();
        new Thread(() -> {
            factors(25, 1500);
        }).start();
    }

    public static void factors(int number, int time) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("Factor of %d : %d%n", number, i);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}