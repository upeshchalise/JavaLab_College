import java.util.Scanner;

public class LongerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words");
        System.out.println("Enter first word: ");
        String firstWord = sc.next();
        System.out.println("Enter second word: ");
        String secondWord = sc.next();

        if(firstWord.length() > secondWord.length()) {
            System.out.println("First word is longer: " + firstWord);
        }else if(secondWord.length() > firstWord.length()) {
            System.out.println("second word is longer: " + secondWord);
        }
        else {
            System.out.println("Equal lengths");
        }
sc.close();
    }
}
