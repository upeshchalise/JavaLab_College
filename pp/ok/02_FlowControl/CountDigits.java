import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number: ");
        int num = sc.nextInt();

        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("No. of digits are: " + count);
        sc.close();
    }
}
