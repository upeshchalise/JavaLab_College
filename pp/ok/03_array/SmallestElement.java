// find smallest element in array

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int SmallestElement = numbers[0];
        for(int i = 1; i<numbers.length; i++) {
            if(SmallestElement > numbers[i]) {
                SmallestElement = numbers[i];
            }
        }
            System.out.println(SmallestElement);
        sc.close();
     }

    public double averageScore(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'averageScore'");
    }
}
