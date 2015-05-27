public static class TreeDiameter{
	public static class  TreeNode{
		List<Pair<TreeNode, Integer>> edges = new ArrayList<>();
	}

	public static Pair<double, double> computeDiamter(TreeNode r){
		double diamteter = Integer.MIN_VALUE;
		double height = {.0, .0};
		for(Pair<TreeNode, Integer> e : r.edges){
			Pair<Double, Double> heightDiam = computeDiamter(e.getFirst());
			if(heightDiam.getFirst() + e.getSecond() > height[0]){
				height[1] = height[0];
				height[0] = heightDiam.getFirst() + e.getSecond();
			}
			else if(heightDiam.getFirst() + e.getSecond()) > height[0]{
				height[1] = heightDiam.getFirst() + e.getSecond();
			}
		}



		return;
	}
}