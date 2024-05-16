package Lambda;

/**
 * The `Uop` class represents a unary operator in the RPAL interpreter.
 * It extends the `Rator` class and provides a constructor to initialize the unary operator.
 */
public class Uop extends Rator {
    /**
     * Constructs a `Uop` object with the specified data.
     *
     * @param data the data representing the unary operator
     */
    public Uop(String data) {
        super(data);
    }
}
