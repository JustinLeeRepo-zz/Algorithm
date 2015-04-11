public static boolean magazineAnonymousLetter(String magazine, String letter){
	Map<Character, Integer> hash = new HashMap<>();

	for(char c : letter.toCharArray()){
		if(!hash.contains(c)){
			hash.put(c, 0);
		}
		hash.put(c, hash.get(c)++);
	}

	for(char c : magazine.toCharArray()){
		if(hash.contains(c)){
			hash.put(c, hash.get(c) - 1);
			if(hash.get(c) == 0){
				hash.remove(c);
				if(hash.isEmpty()){
					return true;
				}
			}
		}
	}
	return hash.isEmpty();
}