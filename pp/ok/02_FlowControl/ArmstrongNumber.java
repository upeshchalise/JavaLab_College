import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int originalNumber = number;

        int reverse;
        int sum = 0;

        while(originalNumber != 0) {
            reverse = originalNumber %10;

            sum = reverse * reverse * reverse;

            originalNumber = originalNumber / 10;

        }
        if(sum == number) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not a armstrong number");
        }
        sc.close();
}
}