import java.util.Scanner;

// class SumUntil0 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int sum = 0;
//         System.out.print("Enter a number: ");
//         int i = sc.nextInt();
//         while ( i != 0) {
//             sum += i;
//             System.out.print("Enter a number: ");
//             i = sc.nextInt();
//         }

//         System.out.println("The sum is: " + sum);
//         sc.close();
//     }
// }

// Using break statement

class SumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double num;

        while(true) {

            System.out.println("Enter a number");
            num = sc.nextDouble();

            if(num == 0) {
                break;
            }

            total = total + num;

        }

        System.out.println("Result:" + total);
        sc.close();

    }
}