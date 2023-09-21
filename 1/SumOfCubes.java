import java.util.Scanner;

// 2. Write a program to input 3 numbers and find the sum of their cubes. For eg: If number are 1,2,3 sum=36.

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("The sum of cubes: %.2f%n", Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

    }
}