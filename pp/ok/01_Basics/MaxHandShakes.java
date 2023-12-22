// package Basics;

import java.util.Scanner;
public class MaxHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int students = sc.nextInt();
        int MaxHandShakes = (students * (students-1)) /2 ;
        System.out.println("the possible handshakes are : " + MaxHandShakes);
        sc.close();
    }
}
