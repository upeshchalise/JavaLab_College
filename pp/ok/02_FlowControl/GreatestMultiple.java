// Create a program to find the greatest multiple of a number below 100.

import java.util.Scanner;

public class GreatestMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for(int i = 100; i>=1; i--) {
            if(i % number == 0) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
