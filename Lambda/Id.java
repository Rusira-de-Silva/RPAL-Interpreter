package Lambda;

/**
 * The `Id` class represents an identifier in the RPAL interpreter.
 * It extends the `Rand` class and provides a way to store and retrieve data.
 */
public class Id extends Rand {
    /**
     * Constructs a new `Id` object with the specified data.
     *
     * @param data the data to be stored in the `Id` object
     */
    public Id(String data) {
        super(data);
    }
    
    /**
     * Returns the data stored in the `Id` object.
     *
     * @return the data stored in the `Id` object
     */
    @Override
    public String getData() {
        return super.getData();
    }
}
