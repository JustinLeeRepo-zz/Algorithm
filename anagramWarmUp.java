public static List<List<String>> findAnagram(String[] dictionary){
	HashMap<string, List<String>> hash = new HashMap<>();
	for(String s : dictionary){
		char[] strCharArray = s.toCharArray();
		String sortedStr = Arrays.toString(Arrays.sort(strCharArray));
		if(hash.containsKey(sortedStr)){
			hash.get(sortedStr).add(s);
		}
		else{
			hash.put(sortedStr, new List<String>());
			hash.get(sortedStr).add(s);
		}

	}

	List<List<String>> result = new ArrayList<>();
	for(Pair<String, List<String>> p : hash){
		if(p.getRight().length > 1){
			result.add(p.getRight());
		}
	}

	return result;
}