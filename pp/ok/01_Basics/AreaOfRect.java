// package Basics;

import java.util.Scanner;
public class AreaOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("the area of rectangle is : " + area);
        sc.close();
    }
}