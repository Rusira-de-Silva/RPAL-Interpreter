package Parser;

/**
 * Represents a node in the RPAL abstract syntax tree.
 */
public class Node {
	public NodeType type;
	public String value;
	public int noOfChildren;

	/**
	 * Constructs a new Node object.
	 *
	 * @param type      the type of the node
	 * @param value     the value associated with the node
	 * @param children  the number of children nodes
	 */
	public Node(NodeType type, String value, int children) {
		this.type = type;
		this.value = value;
		this.noOfChildren = children;
	}
}
