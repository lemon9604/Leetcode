public static void left(TreeNode root, int[] nums){
		if (nums.length == 0){
			return;
		}
		int index = 0;
		int max = -1;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] > max){
				index = i;
				max = nums[i];
			}
		}
		TreeNode LeftNode = new TreeNode(nums[index]);
		root.left = LeftNode;
		left(LeftNode, Arrays.copyOfRange(nums, 0, index));
		right(LeftNode, Arrays.copyOfRange(nums, index+1, nums.length));
	}


	public static void right(TreeNode root, int[] nums){
		if (nums.length == 0){
			return;
		}
		int index = 0;
		int max = -1;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] > max){
				index = i;
				max = nums[i];
			}
		}
		TreeNode RightNode = new TreeNode(nums[index]);
		root.right = RightNode;
		left(RightNode, Arrays.copyOfRange(nums, 0, index));
		right(RightNode, Arrays.copyOfRange(nums, index+1, nums.length));
	}

	public static TreeNode MaximumBinaryTree(int[] nums){
		int index = 0;
		int max = -1;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] > max){
				index = i;
				max = nums[i];
			}
		}
		TreeNode root = new TreeNode(nums[index]);
		left(root, Arrays.copyOfRange(nums, 0, index));
		right(root, Arrays.copyOfRange(nums, index+1, nums.length));
		return root;
	}


public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}