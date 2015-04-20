public static boolean isBST(TreeNode root){
	return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public static boolean isBSTHelper(TreeNode root, int low, int high){
	if(root == null){
		return true;
	}

	if(root.data < low || root.data > high){
		return false;
	}

	return isBSTHelper(root.left, low, root.data) && isBSTHelper(root.right, root.data, high);
}