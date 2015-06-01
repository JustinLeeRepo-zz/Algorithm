public static List<List<Integer>> permutation(List<Integer> a){
	List<List<integer>> result = new ArrayList<>();
	permutationHeler(a, 0,result);
	return result;
}

public static void permutationHelper(List<Integer> a, int idx, List<list<Integer>> result){
	if(idx == a.size() - 1){
		result.add(a);
		return;
	}

	for(int i = idx; i < a.size(); i++){
		Collections.swap(a, i, idx);
		permutationHelper(a, i+1, result);
		Collections.swap(a, i, idx);
	}
}