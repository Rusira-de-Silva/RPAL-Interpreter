package Lambda;

/**
 * The Symbol class represents a symbol in the RPAL interpreter.
 * It stores a string value that represents the symbol's data.
 */
public class Symbol {
    protected String data;
    
    /**
     * Constructs a Symbol object with the specified data.
     * 
     * @param data the data to be stored in the symbol
     */
    public Symbol(String data) {
        this.data = data;
    }
    
    /**
     * Sets the data of the symbol to the specified value.
     * 
     * @param data the new data value for the symbol
     */
    public void setData(String data) {
        this.data = data;
    }
    
    /**
     * Returns the data stored in the symbol.
     * 
     * @return the data of the symbol
     */
    public String getData() {
        return this.data;
    }
}
