/**
 * Diagonal
 *
 *
 *
 * 3. Create an array to store 10 numbers and sort them in ascending order.
 */
public class Diagonal {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        if (arr.length == arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (i == j)
                        System.out.printf("%d ", arr[i][j]);
                }
            }
        }
        System.out.println();
    }
}