public static int FindBatteryCapacity(int[] L){
	int minHeight = Integer.MAX_VALUE;
	int capacity = 0;

	for(int i : L){
		capacity = Math.Max(capacity, i - minHeight);
		minHeight = min(minHeight,	i)
	}

	return capacity;

}