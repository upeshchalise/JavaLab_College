import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int number = sc.nextInt();

        int num = number;
        int remainder;
        int sum = 0;

        while (num != 0) {
            remainder = num % 10;
            sum += remainder;
            num /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
