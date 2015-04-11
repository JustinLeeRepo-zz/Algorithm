public static List<List<String>> Anagrams(String[] dictionary){
	Map<String, List<String>> hash = new HashMap<>();
	for(String s : dictionary){
		char[] sortedChar = s.toCharArray();
		Array.sort(sortedChar);

		String sortedStrAnagram = new String(sortedChar);
		if(!hash.containsKey(sortedStrAnagram)){
			hash.put(sortedStrAnagram, new List<String>());
		}
		hash.get(sortedStrAnagram).add(s);
	}

	List<List<String>> result = new new ArrayList<>();

	for(Map<String, List<String>> p : hash){
		if(p.getValue().length > 1){
			result.add(p.getValue());
		}
	}
	return result;
}