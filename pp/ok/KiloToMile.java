import java.util.Scanner;

public class KiloToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double conversionRatio = 0.621;

        System.out.println("Enter a kilometer value:");

        double kilometer = sc.nextDouble();

        double miles = kilometer * conversionRatio;

        System.out.println("The length in miles is" +  miles);
        sc.close();
    }
}