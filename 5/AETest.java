import java.util.Scanner;

/**
 * AETest
 *
 *
 *
 * 1. Write a program to input two integers, divide the first with second and print the result.
 * Handle ArithmeticException.
 */
public class AETest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        try {
            System.out.printf("Answer : %d%n", a / b);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0");
        }
    }

}