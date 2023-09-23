import java.util.Scanner;


public class Calc {

    public static void main(String[] args) {

        System.out.println("1.Add%n2.Subtract%n3.Multiply%n4.Divide%n");

        Scanner sc = new Scanner(System.in);

        double a,b,s;
        int c;

            System.out.println("Choose what to do...");
            c = sc.nextInt();

            System.out.println("Enter two numbers");
            a = sc.nextDouble();
            b = sc.nextDouble();
            s = 0;

            switch(c) {
                case 1: 
                    s = a + b; 
                    break;
                case 2:
                    s = a - b;
                    break;
                case 3:
                    s = a * b; 
                    break;
                case 4:
                    s = a / b; 
                    break;
               
                default : 
                    System.out.println("you didn't make it");
                    break;
            }
            System.out.printf("Result : %.2f%n", s);
        
    }

}
