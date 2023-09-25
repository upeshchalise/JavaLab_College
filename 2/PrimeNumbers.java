
// 5. Write a program to print all prime numbers between 100 and 200.


    
   public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 200; i++) {
            if (isPrime(i)) {
                count++;
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("%nCount: %d%n", count);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}