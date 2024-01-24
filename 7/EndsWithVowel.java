/*
 * 5. WAP to input name of 5 countries and display only those which end with a vowel.
 */
import java.util.Scanner;import java.util.Arrays;
public class EndsWithVowel {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i=0;i<arr.length;i++) arr[i] = in.nextLine();
        System.out.println("\n\n Names Ending with vowel");
        Arrays.stream(arr).filter(s->{
            char w = s.charAt(s.length()-1);
            if(w=='a'||w=='e'||w=='i'||w=='o'||w=='a'||
            w=='A'||w=='E'||w=='I'||w=='O'||w=='U') return true;
            return false;
        }).forEach(System.out::println);
    } 
}