
public class BinaryTreeImpl {
	Node root;
	
	private Node addNode(Node currNode, int key) {
	    if (currNode == null) {
	        return new Node(key);
	    }
	    if (key < currNode.key) {
	        currNode.leftChild = addNode(currNode.leftChild, key);
	    } else if (key > currNode.key) {
	        currNode.rightChild = addNode(currNode.rightChild, key);
	    } else {
	        return currNode;
	    }
	    return currNode;
	}
	
	public void add(int value) {
	    root = addNode(root, value);
	}
	
	public static void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.leftChild);
	        System.out.print(node.key + " ");
	        traverseInOrder(node.rightChild);
	    }
	}

	public static void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(node.key + " ");
	        traversePreOrder(node.leftChild);
	        traversePreOrder(node.rightChild);
	    }
	}

	public static void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePreOrder(node.leftChild);
	        traversePreOrder(node.rightChild);
	        System.out.print(node.key + " ");
	    }
	}

	public static void main(String[] args) {
		BinaryTreeImpl tree = new BinaryTreeImpl();
		tree.add(10);
		tree.add(5);
		tree.add(7);
		tree.add(3);
		tree.add(15);
		tree.add(12);
		tree.add(11);
		tree.add(16);
		tree.add(18);
		System.out.println("\nInOrder Traversal->");
		traverseInOrder(tree.root);
		System.out.println("\nPreOrder Traversal->");
		traversePreOrder(tree.root);
		System.out.println("\nPostOrder Traversal->");
		traversePostOrder(tree.root);
	}
}
