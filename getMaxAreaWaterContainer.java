public static int getMaxArea(int[] a){
	int i = 0;
	int j = a.length - 1;
	int maxArea = 0;

	while(i <= j){
		maxArea = max(maxArea, min(a[i], a[j]) * (j - i));
		if(a[i] < a[j]){
			i++;
		}
		else if(a[i] > a[j]){
			j--;
		}
		else{
			i++;
			j--;
		}
	}
	return maxArea;
}