package AST_Generator;

import java.util.ArrayList;

/**
 * The NodeFactory class is responsible for creating Node objects.
 */
public class NodeFactory {
    
    /**
     * Constructs a new NodeFactory object.
     */
    public NodeFactory() {
        
    }
    
    /**
     * Creates a new Node object with the specified data and depth.
     * 
     * @param data The data to be stored in the node.
     * @param depth The depth of the node in the tree.
     * @return The newly created Node object.
     */
    public static Node getNode(String data, int depth) {
        Node node = new Node();
        node.setData(data);
        node.setDepth(depth);
        node.children = new ArrayList<Node>();
        return node;
    }
    
    /**
     * Creates a new Node object with the specified data, depth, parent, children, and standardization flag.
     * 
     * @param data The data to be stored in the node.
     * @param depth The depth of the node in the tree.
     * @param parent The parent node of the node.
     * @param children The children nodes of the node.
     * @param isStandardize The flag indicating whether the node is standardized.
     * @return The newly created Node object.
     */
    public static Node getNode(String data, int depth, Node parent, ArrayList<Node> children, boolean isStandardize) {
        Node node = new Node();
        node.setData(data);
        node.setDepth(depth);
        node.setParent(parent);
        node.children = children;
        node.isStandardized = isStandardize;
        return node;
    }
}
