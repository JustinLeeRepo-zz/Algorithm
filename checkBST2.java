public boolean checkBST(TreeNode root){
	return checkBST(root, null, null);
}

public boolean checkBST(TreeNode root, int min, int max){
	if (root == null){
		return true;
	}

	if((min != null && root.data < min)|| (max != null && root.data > max)){
		return false;
	}

	return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
}