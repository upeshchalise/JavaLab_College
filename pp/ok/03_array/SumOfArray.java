// package pp.ok.03_array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for(int i = 0; i<num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
