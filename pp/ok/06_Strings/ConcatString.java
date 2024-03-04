import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word 1");
        String word1 = sc.next();
        System.out.println("Enter word 2");
        String word2 = sc.next();
        String joinedString = word1.concat(" " + word2);
        System.out.println(joinedString);
        sc.close();
    }
}
