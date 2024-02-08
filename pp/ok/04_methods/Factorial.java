import java.util.Scanner;

public class Factorial {

int factorialOfN(int n) {
    int factorial = 1;
    for(int i = 2; i<=n; i++) {
        factorial *= i;
    }
    return factorial;
}
public static void main(String[] args) {
    Factorial obj = new Factorial();

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = obj.factorialOfN(n);
    System.out.println(result);
    sc.close();
}    
}
