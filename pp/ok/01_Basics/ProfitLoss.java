// package Basics;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the selling price");
        int SP = sc.nextInt();
        System.out.println("Enter the cost price");
        int CP = sc.nextInt();

        if(SP >= CP) {
            System.out.println("The profit is Rs: " +  (SP-CP));
        }
        else {
            System.out.println("The loss is Rs: " + (CP - SP));
        }

        sc.close();
    }
} 
