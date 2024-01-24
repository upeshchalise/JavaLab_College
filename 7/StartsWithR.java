/*
 * 
 * 4. WAP to display only those names which start with “R” in an array of 5 names.
 */

import java.util.Scanner;
import java.util.Arrays;

public class StartsWithR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i=0;i<arr.length;i++) arr[i] = in.nextLine();
        System.out.println("\n\n Names Starting with R");
        Arrays.stream(arr).filter(x->x.startsWith("R")).forEach(System.out::println);
    }    
}