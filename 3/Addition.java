/**
 * Addition
 *
 *
 *
 * 5. Write a program to find sum of two 3x4 matrices.
 */
public class Addition {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int b[][] = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};


        int c[][] = new int[3][4];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }


        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }
    }
}