package Lambda;

import java.util.HashMap;

/**
 * The `E` class represents an environment in the RPAL interpreter.
 * It extends the `Symbol` class and provides methods for managing the environment.
 */
public class E extends Symbol {
    private int index;
    private E parent;
    private boolean isRemoved = false;
    public HashMap<Id,Symbol> values;
    
    /**
     * Constructs a new `E` object with the specified index.
     * Initializes the `values` HashMap.
     *
     * @param i The index of the environment.
     */
    public E(int i) {
        super("e");
        this.setIndex(i);
        this.values = new HashMap<Id,Symbol>();
    }
    
    /**
     * Sets the index of the environment.
     *
     * @param i The index to set.
     */
    public void setIndex(int i) {
        this.index = i;
    }
    
    /**
     * Returns the index of the environment.
     *
     * @return The index of the environment.
     */
    public int getIndex() {
        return this.index;
    }
    
    /**
     * Sets the parent environment of the current environment.
     *
     * @param e The parent environment to set.
     */
    public void setParent(E e) {
        this.parent = e;
    }
    
    /**
     * Returns the parent environment of the current environment.
     *
     * @return The parent environment of the current environment.
     */
    public E getParent() {
        return this.parent;
    }
    
    /**
     * Sets the flag indicating whether the environment is removed or not.
     *
     * @param isRemoved The flag indicating whether the environment is removed or not.
     */
    public void setIsRemoved(boolean isRemoved) {
        this.isRemoved = isRemoved;
    }
    
    /**
     * Returns the flag indicating whether the environment is removed or not.
     *
     * @return The flag indicating whether the environment is removed or not.
     */
    public boolean getIsRemoved() {
        return this.isRemoved;
    }
    
    /**
     * Looks up the symbol with the specified id in the environment.
     * If the symbol is not found, it recursively looks up in the parent environment.
     * If the symbol is still not found, it returns a new `Symbol` object with the id.
     *
     * @param id The id of the symbol to lookup.
     * @return The symbol with the specified id, or a new `Symbol` object if not found.
     */
    public Symbol lookup(Id id){
        for (Id key: this.values.keySet()) {
            if (key.getData().equals(id.getData())){
                return this.values.get(key);
            }
        }
        if (this.parent != null) {
            return this.parent.lookup(id);
        } else {
            return new Symbol(id.getData());
        }
    }
}
