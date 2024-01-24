/**
 * LengthExceptionTest
 *
 *
 *
 *
 *
 * 3. Write a program to create your own exception class.
 *
 *
 * 4. Write a program to show the use of "throws" keyword.
 * 
 *
 */




 public class LengthExceptionTest {

    private String firstName, lastName;


    public LengthExceptionTest(String firstName, String lastName) throws LengthException {
        if (firstName.length() > 0 && lastName.length() <= 32 && firstName.length() <= 32
                && lastName.length() > 0) {
            this.firstName = firstName;
            this.lastName = lastName;

        } else
            throw new LengthException();

    }

    public void showName() {
        System.out.printf("Name: %s %s%n", firstName, lastName);
    }

    public static void main(String[] args) {
        try {

            LengthExceptionTest let = new LengthExceptionTest("FirstName", "LastName");
            let.showName();
        } catch (LengthException e) {
            System.err.println(e);
        }

    }
}