// // in Java constructor is simailar to methods, but it doesn't have a return type and it has same name as class

// public class JavaConstructor {
//     // constructor
//     // JavaConstructor() {}

//     // methods
//     // void checkname() {}

//     // similar to methods we need to call constructor to  execute code inside it


//     JavaConstructor() {
//         System.out.println("Calling Constructor");
//     }

//     public static void main(String[] args) {
//         // create an object of the constructor
//         // this calls an constructor
//         // in java when we create object, the constructor is automatically called
//         JavaConstructor obj = new JavaConstructor();
//     }
// }


// default constructor
// if we didn't define any constructor inside java class, java automatically creates a default constructor
// and assign a default value

// example
/**
 * JavaConstructor
 */
// public class JavaConstructor {

//     int marks; 
//     public static void main(String[] args) {
//         JavaConstructor jc1 = new JavaConstructor();
//         System.out.println("Marks: " + jc1.marks);
//     }
// }

// The above code is equivalent to following

class JavaConstructor {
    int marks;

    JavaConstructor() {
        marks = 0;
    }

    public static void main(String[] args) {
        JavaConstructor jc1 = new JavaConstructor();
        System.out.println("Marksss: " + jc1.marks);
    }
}