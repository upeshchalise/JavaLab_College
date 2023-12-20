
public class SwapVariable {
    public static void main(String[] args) {
        double currentSalary = 45232.21;
        double updatedSalary = 46422.12;

        double temp;

        temp = updatedSalary;
        updatedSalary = currentSalary;
        currentSalary = temp;

        System.out.println("Current salary : " + currentSalary);
        System.out.println("Updated salary : " + updatedSalary);
    }
}
