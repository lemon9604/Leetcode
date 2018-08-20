559. Maximum Depth of N-ary Tree

public static int checkChild(Node temp){
	if (temp.children == null){
		return 1;
	}
	else{
		int max = 0;
		int check = 0;
		for (Node child : temp.children){
			check = checkChild(child);
			if (max < check){
				max = check; 
			}
		}
		return max + 1;
	}
}
public int maxDepth(Node root){
	if (root == null){
		return 0;
	}
	int rt = checkChild(root);
	return rt;
}

class Node{
	public int val;
	public List<Node> children;

	public Node(){}

	public Node(int _val, List<Node> _children){
		val = _val;
		children = _children;
	}
}