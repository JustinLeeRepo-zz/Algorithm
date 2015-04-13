public static List<Integer> KLargest(TreeNode root, int k){
    List<Integer> result = new ArrayList<>();
    KLargestHelper(root, k, result);
    return result;
}

public static void findKLargestHelper(TreeNode root, int k, List<Integer> result){
    if(root != null && result.size() < k){
        findKLargestHelper(root.right, k, result);
        if(result.size() < k){
            result.add(root.data);
            findKLargestHelper(root.left, k, result);
        }
    }
}