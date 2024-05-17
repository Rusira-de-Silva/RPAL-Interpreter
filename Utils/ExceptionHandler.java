package Utils;
/**
 * CustomException is a custom exception class that extends the base Exception class.
 * It can be used to handle custom exceptions in the application.
 */
public class ExceptionHandler extends Exception {
    public ExceptionHandler() {
        super();
    }

    public ExceptionHandler(String message) {
        super(message);
    }

    public ExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionHandler(Throwable cause) {
        super(cause);
    }
}