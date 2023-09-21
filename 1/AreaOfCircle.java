import java.util.Scanner;

//  1. Write a program to input radius of circle and find its area.


public class AreaOfCircle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a radius of a circle");
      double radius = sc.nextDouble();
      System.out.printf("Area of circle : %.2f%n",Math.PI * radius * radius);
    }
}
