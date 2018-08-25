590. N-ary Tree Postorder Traversal
public List<Integer> step(List<Integer> raw, Node root){
	if (root.children != null){
		for (Node child: root.children){
			raw = step(raw, child);
		}
	}
	raw.add(root.val);
	return raw;
}
public List<Integer> postorder(Node root){
	List<Integer> rt = new List<Integer>();
	rt =  step(List<Integer> rt, root);
	return rt;
}