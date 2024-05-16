package AST_Generator;

/**
 * The AST (Abstract Syntax Tree) class represents the abstract syntax tree of a program.
 * It provides methods to set and get the root node of the tree, standardize the tree,
 * and print the tree in a pre-order traversal.
 */
public class AST {
    private Node root;
    
    /**
     * Constructs an AST object with the specified root node.
     * 
     * @param root the root node of the abstract syntax tree
     */
    public AST(Node root) {
        this.setRoot(root);
    }
    
    /**
     * Sets the root node of the abstract syntax tree.
     * 
     * @param root the root node to be set
     */
    public void setRoot(Node root) {
        this.root = root;
    }
    
    /**
     * Returns the root node of the abstract syntax tree.
     * 
     * @return the root node of the abstract syntax tree
     */
    public Node getRoot() {
        return this.root;
    }
    
    /**
     * Standardizes the abstract syntax tree by applying transformations to the tree nodes.
     * This method should be called before performing any operations on the tree.
     */
    public void standardize() {  
        if (!this.root.isStandardized) {
            this.root.standardize();
        }
    }
    
    /**
     * Prints the abstract syntax tree in a pre-order traversal.
     * Each node is indented based on its level in the tree.
     */
    private void preOrderTraverse(Node node,int i) {
        for (int n = 0; n < i; n++) {System.out.print(".");}
        System.out.println(node.getData());
        node.children.forEach((child) -> preOrderTraverse(child, i+1));
    }
    
    /**
     * Prints the abstract syntax tree in a pre-order traversal.
     * Each node is indented based on its level in the tree.
     * This method calls the private preOrderTraverse method to perform the traversal.
     */
    public void printAst() {
        this.preOrderTraverse(this.getRoot(), 0);
    }
}
