package Lambda;

/**
 * The `Eta` class represents an eta symbol in the RPAL interpreter.
 * It extends the `Symbol` class and contains information about the index,
 * environment, identifier, and lambda associated with the eta symbol.
 */
public class Eta extends Symbol {
    private int index;
    private int environment;
    private Id identifier;
    private Lambda lambda;
    
    /**
     * Constructs a new `Eta` object with the default name "eta".
     */
    public Eta() {
        super("eta");
    }    
    
    /**
     * Sets the index of the eta symbol.
     * 
     * @param i the index value to set
     */
    public void setIndex(int i) {
        this.index = i;
    }
    
    /**
     * Returns the index of the eta symbol.
     * 
     * @return the index of the eta symbol
     */
    public int getIndex() {
        return this.index;
    }
    
    /**
     * Sets the environment of the eta symbol.
     * 
     * @param e the environment value to set
     */
    public void setEnvironment(int e) {
        this.environment = e;
    }
    
    /**
     * Returns the environment of the eta symbol.
     * 
     * @return the environment of the eta symbol
     */
    public int getEnvironment() {    
        return this.environment;
    }
    
    /**
     * Sets the identifier associated with the eta symbol.
     * 
     * @param id the identifier to set
     */
    public void setIdentifier(Id id) {
        this.identifier = id;
    }
    
    /**
     * Sets the lambda associated with the eta symbol.
     * 
     * @param lambda the lambda to set
     */
    public void setLambda(Lambda lambda) {
        this.lambda = lambda;
    }
    
    /**
     * Returns the lambda associated with the eta symbol.
     * 
     * @return the lambda associated with the eta symbol
     */
    public Lambda getLambda() {
        return this.lambda;
    }
}
