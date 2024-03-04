import java.util.Scanner;

public class FrequencyOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.next();
        System.out.println("Enter a character to find its frequency: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i<word.length(); i++) {
            if(word.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
