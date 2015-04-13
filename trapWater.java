public static int getLargestHeight(List<Integer> a){
	int max = Integer.MIN_VALUE;
	int maxI = -1;

	for(int i = 0; i < a.length; i++){
		if(a.get(i) > max){
			max = a.get(i);
			maxI = i;
		}
	}
	return maxI;
}

public static int trappedWater(List<Integer> a){
	int maxHeightIndex = getLargestHeight(a);

	int sum = 0;
	int left = a.get(0);
	int right = a.get(a.size() - 1);

	for(int i = 1; i < maxHeightIndex; i++){
		if(a.get(i) >= left){
			left = a.get(i);
		}
		else{
			sum = sum + (left - a.get(i));
		}
	}

	for(int i = a.size() - 2; i > maxHeightIndex; i++){
		if(a.get(i) >= right){
			right = a.get(i);
		}
		else{
			sum = sum + (right - a.get(i));
		}
	}

	return sum;
}