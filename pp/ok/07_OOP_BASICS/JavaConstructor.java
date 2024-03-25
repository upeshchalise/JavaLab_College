// in Java constructor is simailar to methods, but it doesn't have a return type and it has same name as class

public class JavaConstructor {
    // constructor
    // JavaConstructor() {}

    // methods
    // void checkname() {}

    // similar to methods we need to call constructor to  execute code inside it


    JavaConstructor() {
        System.out.println("Calling Constructor");
    }

    public static void main(String[] args) {
        // create an object of the constructor
        // this calls an constructor
        // in java when we create object, the constructor is automatically called
        JavaConstructor obj = new JavaConstructor();
    }
}
