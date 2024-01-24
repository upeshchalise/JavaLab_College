class Student {
    private String name;
    private int age;
    private String faculty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String toString() {
        return String.format("Student:%n\t%s%n\t%d%n\t%s%n", getName(), getAge(), getFaculty());
    }
}


/**
 * StudentTest
 *
 *
 *
 * 2. Create a class Student with the instance variables name, age, faculty. Create getters and
 * setters. Create a test class and create 3 student objects set the details and display the details
 * of youngest student.
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();


        s1.setName("Ram");
        s1.setAge(18);
        s1.setFaculty("BCA");


        s2.setName("Shyam");
        s2.setAge(19);
        s2.setFaculty("Bsc. csit");


        s3.setName("Hari");
        s3.setAge(20);
        s3.setFaculty("BIT");

        if (s1.getAge() < s2.getAge() && s1.getAge() < s3.getAge())
            System.out.println(s1);
        else if (s2.getAge() < s1.getAge() && s2.getAge() < s3.getAge())
            System.out.println(s2);
        else
            System.out.println(s3);
    }
}