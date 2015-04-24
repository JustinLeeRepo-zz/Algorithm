public static String reverseSentence(string str){
	char[] strRev = str.toCharArray();
	reverse(strRev, 0, strRev.length;

	int left = 0;
	int right = 0;
	while(left < strRev.length){
		if(strRev[right] != ' ' || right < strRev.length){
			reverse(strRev, left, right);
			left = right + 1;
		}
		right = right + 1;
	}

	return Arrays.toString(strRev);
}