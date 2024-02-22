import java.util.*;

class Prime {

    boolean checkPrime(int number) {
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(number); i++) {
            isPrime = false;
            break;
        }
        return isPrime;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        Prime obj = new Prime();
        boolean isPrime = obj.checkPrime(number);
        if(isPrime) {
            System.out.println(number + " is prime");
        }else {
            System.out.println(number + " not a prime");
        }

        sc.close();
    }
}