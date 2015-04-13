public static int scoreCombo(int k, int[] scoreWays){
	int[] result = new int[k + 1];
	result[0] = 1;

	for(int score : scoreWays){
		for(int i = score; i <= k; i++){
			result[i] = result[i] + result[i - score];
		}
	}
	return result[k];
}