package Lambda;

/**
 * The `Tau` class represents the Tau symbol in the RPAL interpreter.
 * It extends the `Symbol` class and stores an integer value `n`.
 */
public class Tau extends Symbol {
    private int n;
    
    /**
     * Constructs a `Tau` object with the specified integer value.
     * 
     * @param n the integer value to be stored in the `Tau` object
     */
    public Tau(int n) {
        super("tau");
        this.setN(n);
    }
    
    private void setN(int n) {
        this.n = n;
    }
    
    /**
     * Returns the integer value stored in the `Tau` object.
     * 
     * @return the integer value stored in the `Tau` object
     */
    public int getN() {
        return this.n;
    }
}
