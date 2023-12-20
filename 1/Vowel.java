import java.util.Scanner;


// 5. Write a program to input a character and check vowel/ consonant using switch.

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a alphabet:  ");

        char a = sc.nextLine().charAt(0);

        switch(Character.toLowerCase(a)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("vowel");    
            break;
            default : 
            System.out.println("Consonant");
        }
    }
}
