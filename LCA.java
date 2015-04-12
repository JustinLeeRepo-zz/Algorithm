public static TreeNode LCA(TreeNode root, TreeNode low, TreeNode high){
	TreeNode subTree = root;

	while(subTree.data < low.data || subTree.data > high.data){
		while(subTree.data < low.data){
			subTree = subTree.right;
		}

		while(subTree.data > high.data){
			subTree = subTree.left;
		}
	}
	return subTree;
}