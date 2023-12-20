import java.util.Scanner;


// 1. Create an array to store 10 numbers and find the sum of only those numbers whose last digit is 1.

public class ArraySum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter 10 numbers:");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] % 10 == 1)
                sum += nums[i];

        }
        System.out.printf("Sum : %d%n", sum);

    }

}
