public static int squareRoot(int k){
	int low = 0;
	int high = k;
	while(low <= high){
		int mid = low + ((high - low) / 2);
		midSquared = mid * mid;

		if(midSquared > k){
			high = mid - 1;
		}

		else if(midSquared <= k){
			low = mid + 1;
		}
	}
	return left - 1;
}