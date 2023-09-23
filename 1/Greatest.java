import java.util.Scanner;

// 4. Write a program to input 3 numbers and find the greatest one.

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.printf("The largest number is %d%n", a);
        }
        else if(b >= a && b>=c) {
            System.out.printf("The largest number is %d%n", b);
        }
        else {
            System.out.printf("The largest number is %d%n", c);
        }
    }
}
