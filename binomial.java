public static int binomialCoeffiecient(int n, int k){
	int[] table = new int[k + 1];

	table[0] = 1;

	for(int i = 1; i <= n; i++){
		for(int j = min(i,k); j >= 1; j--){
			table[j] = table[j] + table[j-1];
		}
	}
}