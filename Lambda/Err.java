package Lambda;

/**
 * The `Err` class represents an error symbol in the RPAL interpreter.
 * It extends the `Symbol` class and provides a constructor to initialize
 * the error symbol with the name "error".
 */
public class Err extends Symbol {
    /**
     * Constructs a new `Err` object with the name "error".
     */
    public Err() {
        super("error");
    }
}
