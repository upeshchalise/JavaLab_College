import java.util.Scanner;

/**
 * AIOBTest
 * 
 *
 * 2. Write a program to handle ArrayIndexOutOfBoundsException.
 */
public class AIOBTest {

    public static void main(String[] args) {
        int arr[] = {45, 123, 52, 109};

        Scanner in = new Scanner(System.in);

        System.out.print("Enter index: ");
        int i = in.nextInt();

        try {
            System.out.printf("Value : %d%n", arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error");
        }
    }
}