package Lambda;

/**
 * The `Str` class represents a string value in the RPAL interpreter.
 * It extends the `Rand` class and provides a constructor to initialize the string data.
 */
public class Str extends Rand {
    /**
     * Constructs a new `Str` object with the specified string data.
     *
     * @param data the string data to be stored in the `Str` object
     */
    public Str(String data) {
        super(data);
    }
}
