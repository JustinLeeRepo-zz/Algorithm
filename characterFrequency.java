public static void characterFrequency(string str){
	char[] characters = str.toCharArray();
	Arrays.sort(characters);

	int result;
	for(int i = 1; i < characters.length; i++){
		if(characters[i] != characters[i-1]){
			System.out.println(characters[i-1] + " occurs " + result + " times.");
			result = 1;
		}
		else{
			result++;
		}
	}
	System.out.println(characters[characters.length - 1] + " occurs " + result + " times.");
}