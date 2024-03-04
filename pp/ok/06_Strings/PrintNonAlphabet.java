import java.util.Scanner;

public class PrintNonAlphabet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String text = input.nextLine();


        for (int i = 0; i<text.length(); i++) {

            char x = text.charAt(i);

            if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {

                continue;
            }

            System.out.println(x);
        }

        input.close();
    }
}