import java.util.Scanner;

// 3. Write a program to input a number and check odd/even.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int a = sc.nextInt();

        if(a % 2 == 0) {
            System.out.println("The number is even");
        }
        else {

            System.out.println("The number is odd");
        }
    }
}
