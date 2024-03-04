// Replace ___ with your code
import java.util.Scanner;

class CapitalizeString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = input.nextLine();

        String firstLetter = text.substring(0,1);

        String remainingLetters = text.substring(1,text.length());

        firstLetter = firstLetter.toUpperCase();

        text = firstLetter.concat(remainingLetters);
        System.out.println(text);

        input.close();
    }
}