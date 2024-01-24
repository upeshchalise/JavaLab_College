import java.util.Scanner;

// 2. Write a program to find the sum of first N natural numbers.


public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n;
        int sum = 0;

        System.out.println("Enter the number upto where you want to sum");
        n = sc.nextInt();
        
        for(i = 1; i<=n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
