


public class MultipleClass {
    public static void main(String[] args) {
        // create first object
        Student student1 = new Student();
        student1.name = "john";
        student1.marks = 40;
        student1.isPassFail(student1.name, student1.marks);

        // create second object
        Student student2 = new Student();
        student2.name = "maria";
        student2.marks = 32;
        student2.isPassFail(student2.name, student2.marks);
    }
}

public class Student {
String name;
int marks;

void isPassFail(String name, int marks) {
    if(marks >= 35) {
        System.out.println(name + " passed the exam");
    }
    else {
        System.out.println(name+ " failed the exam");
    }
}
   
}