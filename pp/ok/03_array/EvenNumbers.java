
// Even Numbers From Array

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

         for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        sc.close();
    }
}
