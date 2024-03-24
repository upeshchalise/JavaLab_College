// class keyword is used to create class
public class Main {
    // add variables
    // String name = "John";
    // int numbers = 34;

    // in oop aproach, we should just declares fields inside the class and assign values using the object
    String name;
    int numbers;


    // create methods
    void isPassFail(int score) {
        if(score >= 35) {
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");
        }
    }
     public static void main(String[] args) {
        // create objects of Main class
        Main main1 = new Main();
        // Main main2 = new Main();


        // assign values to fields
        main1.name = "John";
        main1.numbers = 35; 

// access fields
        System.out.println("name: " + main1.name);
        System.out.println("numbers: " + main1.numbers);
        // access the method
        main1.isPassFail(40);

        // create multiple objects
        Main main2 = new Main();
        main2.name = "Maria";
        main2.numbers = 43;

        System.out.println("name: " + main2.name);
        System.out.println("numbers: " + main2.numbers);
        main2.isPassFail(23);

    }
}
