import java.util.Scanner;
/*
 *
 *
 *
 * 3. WAP to print the area of rectangle by creating a class named "Area" taking the values of its
 * length and breadth as parameters of its constructor and having a method named returnArea() which
 * returns the area of rectangle. Length and breadth of rectangle are entered through the keyboard.
 *
 */
public class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) throws Exception {
        if (length < 0 || breadth < 0)
            throw new Exception("should be greater than 0");

        this.length = length;


        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length and breadth:");
        double l = in.nextDouble();

        double b = in.nextDouble();

        try {

            Area area = new Area(l, b);
            System.out.printf("Area : %.2f%n", area.returnArea());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}