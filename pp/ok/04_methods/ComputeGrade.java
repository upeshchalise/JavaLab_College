import java.util.Scanner;

public class ComputeGrade {

    double averageScore(int arr[]) {

        int totalMarks = 0;
        for(int i : arr) {
            totalMarks += i;
        }
        double average = totalMarks/(arr.length);
        return average;
    }

    char calculateGrade(double average) {
        
        char grade;
        if(average >= 90) {
            grade = 'A';
        }
         else if(average >= 80) {
            grade = 'B';
        } else if(average >= 70) {
            grade = 'C';
        } else if(average >= 60) {
            grade = 'D';
        } else if(average >= 40) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        return grade;

    }
    public static void main(String[] args) {
        // System.out.println("hello");

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        
        for(int i = 0; i<arr.length; i++) {
            System.out.print("Enter mark for subject: " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        ComputeGrade obj = new ComputeGrade();
        double avgMarks = obj.averageScore(arr);
        System.out.println(avgMarks);
        char grade = obj.calculateGrade(avgMarks);
        System.out.println("grade: " + grade);

        sc.close();
    }
}