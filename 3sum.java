public static boolean 3sum(int[] array, int t){
	collections.sort(a);
	for(int i : array){
		if(3sumHelper(array, t - i)){
			return true;
		}
	}
	return false;
}

public static boolean 3sumHelper(int[] a, int t){
	int j = 0;
	int k = a.length - 1;

	while(j <= k){
		if(a[j] + a[k] == t){
			return true;
		}
		else if(a[j] + a[k] < t){
			j++;
		}
		else {//a[j] + a[k] > t
			k--;
		}
	}
	return false;
}