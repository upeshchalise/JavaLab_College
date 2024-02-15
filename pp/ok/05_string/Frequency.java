/**
 * Frequency
 */
public class Frequency {

    public static void main(String[] args) {
        String sentence = "This is the sentence in the implementation of frequency";
        char letter = 'i';

        int letterCount = 0;

        for(int i = 0; i<sentence.length(); i++) {
            if(sentence.charAt(i) == letter) {
                letterCount++;
            }
        }
        System.out.println("frequency:: "+  letterCount);
    }
}