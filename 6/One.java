import java.util.stream.IntStream;

/**
 * One
 *
 *
 * 1. Create a thread which displays the numbers 1 to 10 in the interval of 1 second.
 */
public class One {

    public static void main(String[] args) {

        new Thread(() -> {
            IntStream.range(1, 11).forEach(i -> {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            });
        }).start();
    }
}