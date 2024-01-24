import java.util.Scanner;

/**
 * GAS
 *
 *
 *
 *
 * 2. Create an array to store 10 numbers in an array and find the greatest and smallest number.
 */
public class GAS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter 10 numbers:");
        nums[0] = in.nextInt();
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }

        System.out.printf("Greatest:%d%nSmallest:%d%n", max, min);

    }
}