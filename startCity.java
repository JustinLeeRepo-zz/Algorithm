public static int findStartCity(int[] g, int[] d){
	int travelCost = 0;
	Pair<Integer, Integer> min = new Pair<>(0,0);

	for(int i = 1; i < g.length; i++){
		travelCost = travelCost + g[i - 1] - d[i - 1];
		if(travelCost < min.getSecond()){
			min = new Pair<>(i, travelCost);
		}
	}
	return min.getFirst();
}