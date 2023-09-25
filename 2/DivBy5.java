// 1. Write a program to print the numbers between 100 to 200 which are exactly divisible by 5.


public class DivBy5 {
    public static void main(String[] args) {
        for(int i = 100; i<=200; i++) {
            if(i%5==0) {
                System.out.println(i);
            }
        }
    }
}