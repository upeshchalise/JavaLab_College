class Student {
    int rollNo;

    public void readRoll(int rollNo) {
        this.rollNo = rollNo;
    }

    public void displayRoll() {
        System.out.printf("Roll No: %d%n", rollNo);
    }
}


class Test extends Student {
    double math, science;

    public void readMarks(double math, double science) {
        this.math = math;
        this.science = science;
    }

    public void displayMarks() {
        System.out.printf("Marks:%n\tMath: %.2f%n\tScience:%.2f%n", math, science);
    }
}



/**
 * Result
 *
 *
 * 5.Create a class Student with instance variables roll_no and two methods to read and display the
 * rollno. Then create another class Test that inherits class Student consisting of its own instance
 * variable to hold the marks of two subjects and methods to read and display the marks. Finally
 * create another class Result which inherits class Test. It also has its own instance vaiable total
 * to hold the total marks scored by the student. Similarly it has methods to calculate and display
 * the total. Create an object of Result class set and display the details.
 */
public class Result extends Test {
    double total;

    public void calculateTotal() {
        total = math + science;
    }

    public void displayTotal() {
        System.out.printf("Student : %d%n\tTotal : %.2f%n", rollNo, total);
    }

    public static void main(String[] args) {
        Result result = new Result();

        result.readRoll(1);
        result.readMarks(90, 50);
        result.calculateTotal();
        result.displayTotal();
    }

}