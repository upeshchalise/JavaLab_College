import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number whose table you wanted: ");

        int num = sc.nextInt();

        for(int i = 0; i<=10; i++) {
            int product = num * i;
            System.out.println(num + " * " + i + " = " + product );
        }
        sc.close();
    }
}