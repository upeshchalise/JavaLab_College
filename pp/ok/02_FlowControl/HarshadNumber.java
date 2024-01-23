//  A Harshad number is an integer which is divisible by the sum of its digits. For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).

import java.util.Scanner;

public class HarshadNumber {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int number = sc.nextInt();
    int num = number;
    int sum = 0;
    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }
    if(number % sum == 0) {
        System.out.println(true);
    }else {
        System.out.println(false);
    }
    sc.close();
}
}
