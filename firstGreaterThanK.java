public static TreeNode findFirstGreaterThanK(TreeNode root, int k){
    TreeNode subtree = root;
    TreeNode result = null;

    while(subtree != null){
        if(subtree.data > k){
            result = subtree;
            subtree = subtree.left;
        else{
            subtree = subtree.right;
        }
    }
    return result;
}
