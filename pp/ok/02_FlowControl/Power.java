// Create a program to find the power of a number.

import java.util.Scanner;

/**
 * Power
 */
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter a power: ");
        int power = sc.nextInt();

            int result = 1;
        for(int i = 1; i<=power; i++) {
            result *= num;
        }
        System.out.println(result);
        sc.close();
    }
}