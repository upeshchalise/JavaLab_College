// package pp.ok.04_methods;

import java.util.Scanner;

public class Print {
    void printNumbers() {
        System.out.println(5);
        System.out.println(100);
    }

    void squareNumber() {
        int a = 12;
        System.out.println("Square of a number is " + a*a);
    }

    void cubeNumber() {
        int a = 5;
        System.out.println("Cube a number " + a + " is " + Math.pow(a, 3));
    }

    //passing arguments input methods
    void addNumbers(double n1, double n2) {
        double result = n1 + n2;
        System.out.printf("the sum of %.2f and %.2f is %.2f%n",n1,n2,result);
    }

    // return method
    int squareNumber1(int n) {
        int result = n * n;
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        Print obj = new Print();
        obj.printNumbers();
        obj.printNumbers();

        obj.squareNumber();
        obj.cubeNumber();

        obj.addNumbers(number1,number2);
        int result = obj.squareNumber1(4);
        System.out.println("Square from return : " +  result);
        sc.close();

    }
}