// Find Percentage Marks Of Student

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        double[] marks = new double[8];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        double obtainedMarks = 0.0;

        for(double mark: marks) {
            obtainedMarks += mark;
        }
        double totalMarks = 800.0;
        double percentage = (obtainedMarks/totalMarks) * 100;
        System.out.println(percentage);
        sc.close();

    }
}
