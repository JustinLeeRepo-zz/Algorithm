public static String ParseNoSpaceString(string[] dictionary, string noSpaceString){
	int left = 0;
	int right = input.length() - 1;
	Map<Character, String> hash = new HashMap<>();
	StringBuilder result;

	while(left <= noSpaceString.length() - 1){
		if(right == input.length() - 1){
			string subStr = noSpaceString.substring(left);
		}
		else{
			string subStr = noSpaceString.substring(left, right + 1);
		}

		if(hash.contains(subStr.toCharArray()[0])){
			left = right + 1;
			right = noSpaceString.length() - 1;
			result.append(subStr);
			result.append(' ');
		}
		else{
			right = right - 1;
		}
	} 
	return result;

}