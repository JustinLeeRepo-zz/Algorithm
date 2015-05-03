public static List<List<Integer>> powerSet(List<Integer> S){
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> oneSet = new ArrayList<>();
	powerSetHelper(S, 0, oneSet, result);

	return result;
}

public static void powerSetHelper(List<Integer> S, int idx, List<Integer> one, List<List<Integer>> result){
	result.add(one);

	for(int i = idx; i < S.size(); i++){
		one.add(S.get(i));
		powerSetHelper(S, i + 1, one, result);
		one.remove(S.get(i));
	}
}