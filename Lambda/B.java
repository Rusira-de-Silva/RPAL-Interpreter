
package Lambda;

import java.util.ArrayList;

/**
 * Represents the B symbol in the RPAL interpreter.
 * The B symbol is a subclass of the Symbol class.
 */
public class B extends Symbol {
    public ArrayList<Symbol> symbols;
    
    public B() {
        super("b");
    }
    
}
