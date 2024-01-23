public class LargestElement {
    public static void main(String[] args) {
        int numbers[] = {23,53,65,32,16};

        // for(int i = 0; i<numbers.length; i++) {
        //     for(int j =0; j < i -1; j++) {
        //         if(numbers[j] > numbers[j+1]) {
        //             System.out.println(numbers[j]);
        //         }
        //     }
        // }

        int largest = numbers[0];
        for(int i = 1; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
         System.out.println(largest);
    }
}
