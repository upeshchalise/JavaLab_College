import java.util.Scanner;

public class Person {
String name;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a name for person 1: ");
    String name1 = sc.nextLine();
    
    System.out.println("enter a name for person 2: ");
    String name2 = sc.nextLine();

    Person person1 = new Person();
    Person person2 = new Person();

    person1.name = name1;
    person2.name = name2;

    System.out.println("Person1: " + person1.name);
    System.out.println("Person2: " + person2.name);


sc.close();
}
}
