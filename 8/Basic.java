/*
 * 
 * 1. WAP to input a line of text, store it in a file
 *  and then read from the file to display its contents.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("basic.txt");
            writer.write((new Scanner(System.in)).nextLine());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("basic.txt"));
            reader.lines().forEach(System.out::println);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}