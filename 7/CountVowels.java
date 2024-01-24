/*
 * 
 * 3. WAP to count no. of vowels in a given string.
 */

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc =new Scanner(System.in);
        
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++) {
            char w=s.charAt(i);
            if(w=='a'||w=='e'||w=='i'||w=='o'||w=='a'||
            w=='A'||w=='E'||w=='I'||w=='O'||w=='U') {count++;
        }}
        System.out.printf("Coutn : %d%n",count);
    }
}