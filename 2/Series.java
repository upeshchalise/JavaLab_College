
// // 4. Write a program to display the series:
//    *           *****         12345
//    **           ***          1234
//    ***           *           123
//    ****			            12
//    *****                     1


public class Series {
    public static void main(String[] args) {

        for(int i = 0; i<=5; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int s = 0;
        for(int i = 5; i > 0; i-=2) {
            for(int j = 0; j<s; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
            s++;
        }


        System.out.println();
        for(int i = 5; i>=1; i--) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
