/*
 * 
 * 2. WAP to input name of college and number of
 *  students of 10 colleges, store them in a
 *  file and then read from the file to display only those
 *  college names whose number of students is more than 500.
 * 
 * 4. WAP to using the concept of serialization
 *  to store an object to a file and then display
 *  its contents reading from the file.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class College implements Serializable{
    static int NUM_OF_COLLEGE = 2;
    String name;int students;

    public String toString() {
        return String.format("College\n\tName:%s%n\tStudent:%d%n",name,students);
    }
    public static void main(String[] args) {
        College[] colleges = new College[NUM_OF_COLLEGE];

        Scanner in = new Scanner(System.in);
        try {
            ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("college.txt"));
            System.out.println("College name and number of students:");
            for(int i=0;i<colleges.length;i++) {
                colleges[i] = new College();
                colleges[i].name = in.nextLine();
                colleges[i].students = Integer.parseInt(in.nextLine());
                write.writeObject(colleges[i]);
            }
            write.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("college.txt"));
            for(int i=0;i<NUM_OF_COLLEGE;i++) System.out.println(ois.readObject());
            ois.close();
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        in.close();
    }
}