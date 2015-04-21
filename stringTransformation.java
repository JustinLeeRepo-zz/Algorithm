public static int stringTransformation(Set<String> d, String s, String t){
	LinkedList<Pair<String, Integer>> q = new LinkedList<>();
	d.remove(s);

	q.addLast(s, 0);

	while(!q.isEmpty()){
		Pair<String, Integer> f = new Pair<>(q.removeFirst());
		if (f.getFirst().equals(t)){
			return f.getSecond();
		}

		string str = f.getFirst();
		char[] charStr = str.toCharArray();
		for(int i = 0; i < charStr.length; i++){
			char previousChar = charStr[i];
			for(int j = 0; j < 26; j++){
				charStr[i] = (char) ('a' + j);
				string modStr = Arrays.toString(charStr);
				if(d.remove(modStr)){
					q.addLast(new Pair<String, Integer>(modStr, f.getSecond() + 1));
				}
			}
			char[i] = previousChar;
		}
		q.removeFirst();
	}
	return -1;
}