package Lambda;

import java.util.ArrayList;

/**
 * The `Tup` class represents a tuple in the RPAL interpreter.
 * It extends the `Rand` class and contains a list of symbols.
 */
public class Tup extends Rand {
    public ArrayList<Symbol> symbols;
    
    /**
     * Constructs a new `Tup` object with an empty list of symbols.
     */
    public Tup() {
        super("tup");
        this.symbols = new ArrayList<Symbol>();
    }
}
