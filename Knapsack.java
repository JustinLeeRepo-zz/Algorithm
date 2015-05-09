public static int Knapsack(int w, List<Pair<Integer, Integer>> items){
	int[] result = new int[w + 1];
	for(List<Pair<Integer, Integer>> item : items){
		for(int j = w; j >= item.getFirst(); j--){
			result[j] = max(result[j], result[j - item.getFirst()] + item.getSecond());
		}
	}
}