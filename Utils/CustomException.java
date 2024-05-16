package Utils;
/**
 * CustomException is a custom exception class that extends the base Exception class.
 * It can be used to handle custom exceptions in your application.
 */
public class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}