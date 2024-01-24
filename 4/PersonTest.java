class Person {
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("Name: %s %s%nAge: %d%n", firstName, lastName, age);
    }
}


class Student extends Person {
    private String faculty;

    public Student(String firstName, String lastName, int age, String faculty) {
        super(firstName, lastName, age);

        this.faculty = faculty;
    }

    public void showInfo() {
        super.showInfo();
        System.out.printf("Faculty: %s%n", faculty);
    }
}


class Teacher extends Person {
    private double salary;

    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }


    public void showInfo() {
        super.showInfo();
        System.out.printf("Salary: %.2f%n", salary);
    }
}


/**
 * PersonTest
 *
 *
 *
 *
 * 4. Create a class Person with firstName,lastName,age. Create a parameterized constructor to
 * initialize the variables and a method void showInfo() to display person details. Create a class
 * Student which is sub class of Person and add the field String faculty Override the method
 * showInfo() to display faculty. Create a class Teacher which is a sub class of Person and add the
 * field double salary.Override the method showInfo() to display salary. Provide a test class.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person student = new Student("ram", "ram", 2679, "Sanskrit");
        Person teacher = new Teacher("Janak", "puri", 2679, 100000.0);

        student.showInfo();
        teacher.showInfo();
    }
}