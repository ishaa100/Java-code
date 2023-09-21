public class Height_BT {
 
	int data;
	Height_BT left, right;

	Height_BT(int item)
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	Height_BT root;

	
	int maxDepth(Height_BT node)
	{
		if (node == null)
			return 0;
		else {
			
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();

		tree.root = new Height_BT(1);
		tree.root.left = new Height_BT(2);
		tree.root.right = new Height_BT(3);
		tree.root.left.left = new Height_BT(4);
		tree.root.left.right = new Height_BT(5);

		System.out.println("Height of tree "
						+ tree.maxDepth(tree.root));
	}

    
}
