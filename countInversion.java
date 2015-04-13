public static int countInversion(int[] A){
	return countInversionHelper(A, 0, A.length);
}

public static int countInversionHelper(int[] a, int start, int end){
	if(end - start <= 1){
		return 0;
	}

	int mid = start + ((end - start) / 2);

	return countInversionHelper(a, start, mid) + countInversionHelper(a, mid, end) + merge(a, start, mid, end);
}

public static int merge(int[] a, int start, int mid, int end){
	List<Integer> sortedA = new ArrayList<>();
	int left = start;
	int right = mid;
	int result = 0;

	while(left < mid && right < end){
		if(a[left] > a[right]){
			result = result + (mid - left);
			sortedA.addLast(a[right++]);
		}
		else{
			sortedA.addLast(a[left++]);
		}
	}

	sortedA.addAll(a.sublist(left, mid));
	sortedA.addAll(a.sublist(right, end));


	int aItr = start;
	for(Integer i : sortedA){
		a.set(aItr++, i);
	}
	return result;
}