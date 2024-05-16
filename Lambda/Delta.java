package Lambda;


import java.util.ArrayList;

/**
 * The Delta class represents a delta symbol in the RPAL interpreter.
 * It extends the Symbol class and contains an index and a list of symbols.
 */
public class Delta extends Symbol {
    private int index;
    public ArrayList<Symbol> symbols;
    
    /**
     * Constructs a Delta object with the specified index.
     * 
     * @param i the index of the delta symbol
     */
    public Delta(int i) {
        super("delta");
        this.setIndex(i);
    }
    
    /**
     * Sets the index of the delta symbol.
     * 
     * @param i the index of the delta symbol
     */
    private void setIndex(int i) {
        this.index = i;
    }
    
    /**
     * Returns the index of the delta symbol.
     * 
     * @return the index of the delta symbol
     */
    public int getIndex() {
        return this.index;
    }    
}
