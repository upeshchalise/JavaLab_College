// package 02_FlowControl;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to know if its a leap year: ");

        double year = sc.nextDouble();

        if((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("The year %.2f is leap year%n", year);
        }
        else {
            System.out.printf("The year %.2f is not a leap year%n", year);
        }
        sc.close();
    }
}
