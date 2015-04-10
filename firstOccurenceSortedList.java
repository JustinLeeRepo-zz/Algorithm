public static int firstOccurrenceSortedList(int[] sortedArray, int k){
	int low = 0;
	int high = sortedArray.length - 1;
	int result = -1;

	while(left <= high){
		int mid = low + ((high - low) / 2);
		if(sortedArray[mid] < k){
			low = mid + 1;
		}
		else if (sortedArray[mid] > k){
			high = mid - 1;
		}
		else {
			result = mid;
			high = mid - 1;
		}
	}
	return result;
}