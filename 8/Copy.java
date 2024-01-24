/*
 * 
 * 3. A data file "university.txt" contains some text. WAP to copy the content of "university.txt" to "college.txt".
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("University.txt");
            FileWriter writer = new FileWriter("college.txt"); 
            int a;
            StringBuilder text = new StringBuilder();
            while((a=reader.read())!=-1) text.append(((char) a));
            System.out.println(text);
            writer.write(text.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}