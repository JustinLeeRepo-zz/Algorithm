public static List<Integer> postOrder(TreeNode root){
	Stack<TreeNode> nodeStack = new Stack<>();
	nodeStack.push(root);
	List<integer> result = new List<>();
	while(!nodeStack.isEmpty()){
		TreeNode cur = nodeStack.pop();
		result.add(cur.value);
		nodeStack.push(node.left);
		nodeStack.push(node.right);
	}
	return Collections.reverse(result);
}