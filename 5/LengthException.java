/**
 * LengthException
 *
 *
 *
 *
 * 3. Write a program to create your own exception class.
 */
public class LengthException extends Exception {
    public LengthException() {
        super("Length should be between 0 - 32");
    }
}