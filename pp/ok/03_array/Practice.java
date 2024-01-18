// package pp.ok.03_array;

public class Practice {
    public static void main(String[] args) {
        // array declaration
        int[] age = {23,42,53,24,65};

        // defining specific size to array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4]=5;

        // access the array element
        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        // System.out.println(age[3]);
        // System.out.println(age[4]);

        // instead of accessing individually we can access using loops
        for(int i = 0; i<age.length; i++) {
            System.out.println(age[i]);
        }

        // change array element
        // We can also change the values of array elements by assigning new values to them.
        age[1] = 50;
        age[3] = 21;
        System.out.println("After changing: ");
           for(int i = 0; i<age.length; i++) {
            System.out.println(age[i]);
        }

    }
}
