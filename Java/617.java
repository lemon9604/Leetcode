public static void addTree(TreeNode t1, TreeNode t2){
		if (t2 != null){
			t1.val += t2.val;
			if (t1.left != null){
				addTree(t1.left, t2.left);
			} 
			else if (t2.left != null) {
				TreeNode newleft = new TreeNode();
				t1.left = newleft;
				addTree(t1.left, t2.left);
			}
			if (t1.right != null){
				addTree(t1.right, t2.right);
			} 
			else if (t2.right != null) {
				TreeNode newright = new TreeNode();
				t1.right = newright;
				addTree(t1.right, t2.right);
			}
		}

	
		
	}
	
	public static TreeNode MergeTwoBinaryTrees(TreeNode t1, TreeNode t2){
		if (t1 == null){
			return t2;
		}
		else {
			addTree(t1, t2);
			return t1;
		}
	}




public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x;}
}