/**
 * Animals
 *
 *
 *
 * 3. Create two threads, the first thread should display the name of any 5 birds in the interval of
 * 1 second and second thread should display the name of any 5 animals in the interval of 1 and half
 * second.
 */
public class Animals {

    public static void main(String[] args) {
        new Thread(() -> {
            String birds[] = {"birds", "sparrow", "crow", "parrot", "eagles", "owl"};
            display(birds, 1000);
        }).start();
        new Thread(() -> {
            String animals[] = {"Animals", "Cat", "Lion", "Tiger", "Dog", "Cow"};
            display(animals, 1500);
        }).start();
    }

    public static void display(String arr[], int time) {
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%s : %s%n", arr[0], arr[i]);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}