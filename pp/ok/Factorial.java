import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        int i = 1;

        while(i <= num) {
            factorial *=  i;
            i++;
        }
        System.out.printf("The factorial of %d%n is %d%n", num, factorial);

        sc.close();
    }
}