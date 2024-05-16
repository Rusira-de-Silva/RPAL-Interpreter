package Lambda;

import java.util.ArrayList;

/**
 * Represents a Lambda symbol in the RPAL interpreter.
 */
public class Lambda extends Symbol {
    private int index;
    private int environment;
    public ArrayList<Id> identifiers;
    private Delta delta;
    
    /**
     * Constructs a new Lambda object with the given index.
     * 
     * @param i The index of the Lambda object.
     */
    public Lambda(int i) {
        super("lambda");
        this.setIndex(i);
        this.identifiers = new ArrayList<Id>();
    }
    
    private void setIndex(int i) {
        this.index = i;
    }
    
    /**
     * Returns the index of the Lambda object.
     * 
     * @return The index of the Lambda object.
     */
    public int getIndex() {
        return this.index;
    }
    
    /**
     * Sets the environment of the Lambda object.
     * 
     * @param n The environment value to set.
     */
    public void setEnvironment(int n) {
        this.environment = n;
    }
    
    /**
     * Returns the environment of the Lambda object.
     * 
     * @return The environment of the Lambda object.
     */
    public int getEnvironment() {
        return this.environment;
    }
    
    /**
     * Sets the Delta object of the Lambda object.
     * 
     * @param delta The Delta object to set.
     */
    public void setDelta(Delta delta) {
        this.delta = delta;
    }
    
    /**
     * Returns the Delta object of the Lambda object.
     * 
     * @return The Delta object of the Lambda object.
     */
    public Delta getDelta() {
        return this.delta;
    }
}
