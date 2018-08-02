public static int checkleftchild(TreeNode node){
		int left = 0;
		int right = 0;
		if (node.left != null){
			left = checkleftchild(node.left);
		}
		if (node.right != null){
			right = checkleftchild(node.right);
		}
		if (left == 0){
			node.left = null;
		}
		if (right == 0){
			node.right = null;
		}
		return left + right + node.val;


	}
	
	public static TreeNode pruneTree(TreeNode root){
		if (root.left != null){
			if (checkleftchild(root.left) == 0){
				root.left = null;
			}
		}
		if (root.right != null){
			if (checkleftchild(root.right) == 0){
				root.right = null;
			}
		}
		return root;
	}




public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x;}
}