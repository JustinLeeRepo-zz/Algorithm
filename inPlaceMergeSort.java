public static void inPlaceMergeSort(int[] a1, int m, int[] a2, int n){
	int a = m - 1;
	int b = n - 1;
	int writeIdx = m + n - 1;

	while(a >= 0 && b >= 0){
		if(a1[a] > a2[b]){
			a1[writeIdx--] = a1[a--];
		}
		else{
			a1[writeIdx--] = a2[b--];
		}
	}

	while(b >= 0){
		a1[writeIdx--] = a2[b--];
	}
}