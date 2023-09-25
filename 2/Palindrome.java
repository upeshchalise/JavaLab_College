
// 6. Write a program to print all palindrome numbers 100 to 500.


public class Palindrome {
    public static void main(String[] args) {
        for(int i = 100; i<= 500; i++ ) {
            if(isPalindrome(i)) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();

    }

    public static boolean isPalindrome(int number) {
        int rev = 0, num = number; 
        
        while(num != 0) {
            rev = rev*10 + num % 10;
            num /= 10;
        }
        return rev == number;

    }
}
