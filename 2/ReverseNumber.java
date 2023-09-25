import java.util.Scanner;


// 3. Write a program to input a number and find its reverse.


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int rev = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n != 0) {
            rev = rev*10 + n%10;
            n /= 10;
        }
        System.out.printf("Reverse : %d%n", rev);
    }
    
}
