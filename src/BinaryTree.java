public class BinaryTree<T> {

	public Node<T> root;

	public BinaryTree() {
		this.root = null;
	}

	public int size(Node<T> root) {
//		The size of a tree is equal to the number of its nodes.
//		Base case: When there are no further nodes to travel down.
//		Strategy: The size of a tree is equal to the size of its left subtree plus its right sub tree plus itself.
		if(root == null){
			return 0;
		}

//		int count = 1;
//
//		count += size(root.left) + size(root.right);
//
//		if(root.left == null && root.right == null){
//			return count;
//		}
		return size(root.left) + size(root.right) + 1;
	}

	public int leafCount(Node<T> root) {
//		The leaves of a tree are nodes with no children.
//		Base case: When there are no further nodes to travel down.
//		Strategy: The number of leaves of a tree is equal to the number of leaves contained in its left subtree plus the number of leaves in its right subtree.
		if(root == null){
			return 0;
		}

		if(root.left == null && root.right == null){
			return 1;
		}

		return leafCount(root.left) + leafCount(root.right);
	}

	public int height(Node<T> root) {
		if(root == null){
			return 0;
		}

		int h1 = height(root.left);
		int h2 = height(root.right);

		if(h1 > h2){
			return h1 + 1;
		}
		else{
			return h2 + 1;
		}
		// return Math.max(height(root.left),height(root.right)) + 1;
	}
}
