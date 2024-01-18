// package pp.ok.03_array;

import java.util.Scanner;

public class FindAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[5];

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println(average);
        sc.close();
    }
}
