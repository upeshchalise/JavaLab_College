
// Create a program to multiply each element of an array by 10.

import java.util.Scanner;

public class Multiply {
     public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i: numbers) {
            System.out.println(i * 10);
        }

        sc.close();
    }
}
