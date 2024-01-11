
import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        
        int upto = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i<=upto) {
            sum += i;
            i++;
        }
        System.out.printf("The sum of %d natural numbers is %d%n", upto, sum);


        sc.close();

    }    
}