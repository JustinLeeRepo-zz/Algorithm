public static int numWays2DarrayObject(int n, int m, List<List<boolean>> b){
	int[][] a = new int[n][m];

	if(b.get(0).get(0)){
		return 0;
	}

	a[0][0] = 1;

	for(int i = 0; i < n; i++){
		for(int j = 0; j < m; j++){
			if(!b.get(i).get(j)){ 
				a[i][j] = a[i][j] + (i < 1 ? 0 : a[i - 1][j]) + (j < 1 ? 0 : a[i][j - 1]);
			}
		}
	}
}