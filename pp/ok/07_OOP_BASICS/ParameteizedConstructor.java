// THIS KEYWORD
// => in java we use THIS keyword to refer to current object
// eg;
/**
 * ParameteizedConstructor
 */
// public class ParameteizedConstructor {

//     String name;

//    void displayName() {
//         System.out.println("Name from this; "  + this.name);
//     }

//     public static void main(String[] args) {
//         // this refers to student1 object
//         ParameteizedConstructor student1 = new ParameteizedConstructor();
//         student1.name = "john";
//         student1.displayName();
// // print using object
// System.out.println("Name from object : " + student1.name);

//         // this refers to student2 object
//         ParameteizedConstructor student2 = new ParameteizedConstructor();
//         student2.name = "lisa";
//         student2.displayName();
//     }
// }



//CHECK PASS OR FAIL

// public class ParameteizedConstructor {

//     public static void main(String[] args) {
//         Student student1 = new Student();
//         student1.name = "john";
//         student1.marks = 54;

//         student1.checkPassFail();

//         Student student2 = new Student();
//         student2.name = "cena";
//         student2.marks = 32;
//         student2.checkPassFail();
//     }
    
// }

// public class Student {

//     int marks;
//     String name;

//     void checkPassFail() {
//         if(this.marks > 35) {
//             System.out.println(this.name + " passed the exam");
//         } else {
//             System.out.println(this.name + " failed the exam");
//         }
//     }
// }


// PARAMATERIZED CONSTRUCTOR
/**
 * ParameteizedConstructor
 */
public class ParameteizedConstructor {

public static void main(String[] args) {
    // create objects
    Student student1 = new Student("John", 35);
    Student student2 = new Student("Cena", 43);

    // print fields for student1
    System.out.println("----- First student -----");
    System.out.println("name: " + student1.name);
    System.out.println("marks: " + student1.marks);

     // print fields for student2
    System.out.println("----- Second student -----");
    System.out.println("name: " + student2.name);
    System.out.println("marks: " + student2.marks);
}
}

/**
 * Student
 */
 class Student {

    String name;
    int marks;

    // paramaterized constructor 
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}