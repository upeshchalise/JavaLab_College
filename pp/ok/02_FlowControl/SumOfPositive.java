// package 02_FlowControl;

// We will get the sum of positive numbers entered by the user.
// If the user enters a negative number, we will not add that number to total.
// And if the user enters 0, we will end the program.

import java.util.Scanner;

public class SumOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if(num < 0) continue;
            if(num == 0) break;
            total += num;
        }
        System.out.println("Total is: " + total);
        sc.close();
    }
}
