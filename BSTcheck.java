public static class Status{
	private boolean balanced;
	private int height;

	public Status(boolean b, int h){
		balanced = b;
		height = h;
	}
}

public static boolean isBalanced(TreeNode root){
	return balancedHelper(root).balanced;
}

public static Status balancedHelper(TreeNode root){
	if(root == null){
		return new Status(true, -1);
	}

	Status leftSubTree = balancedHelper(root.left);
	if(!leftSubTree.balanced){
		return leftSubTree;
	}

	Status rightSubTree = balancedHelper(root.right);
	if(!rightSubTree.balanced){
		return rightSubTree;
	}

	int heightDiff = abs(leftSubTree.height - rightSubTree.height);
	if(heightDiff > 1){
		return new Status(false, max(leftSubTree.height, rightSubTree.height));
	}

	return new Status(true, max(leftSubTree.height, rightSubTree.height) + 1);
}