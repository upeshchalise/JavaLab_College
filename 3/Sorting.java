import java.util.Scanner;

/**
 * Sorting
 * 
 *
 *
 * 3. Create an array to store 10 numbers and sort them in ascending order.
 */
public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter 10 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();

        }

        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}