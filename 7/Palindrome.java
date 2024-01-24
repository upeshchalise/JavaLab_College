import java.util.Scanner;
/*
 * 2. WAP to input a word and check whether it is palindrome or not.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println((isPalindrome((new Scanner(System.in)).nextLine())?"":"not")+"palindrome");
    }

    public static boolean isPalindrome(String s) {
        int i=0,len=s.length(),j=len-1;
        while(i<len/2) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
}