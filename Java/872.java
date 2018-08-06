public static void checkchild(TreeNode root, List<Integer> tree){
    	if (root.left == null && root.right == null){
    		tree.add(root.val);
    	}
    	else{
    		if (root.left != null){
    			checkchild(root.left, tree);
    		}
    		if (root.right != null){
    			checkchild(root.right, tree);
    		}
    	}
    }
	
	public static boolean leafSimilar(TreeNode root1, TreeNode root2){
		List<Integer> tree1 = new ArrayList<Integer>();
		List<Integer> tree2 = new ArrayList<Integer>();
		checkchild(root1, tree1);
		checkchild(root2, tree2);

		if (tree1.size() == tree2.size()){
			for (int i = 0; i < tree1.size(); i++){
				if (tree1.get(i) != tree2.get(i)){
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
		
	}


public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode (int x) {val = x;}
}

