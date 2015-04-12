public static List<Integer> intersectionTwoSortedArray(int[] a1, int[] a2){
	List<Integer> result = new ArrayList<>();

	int i = 0;
	int j = 0;

	while(i < a1.length || j < a2.length){
		if(a1[i] < a2[j]){
			i++;
		}
		else if(a1[i] > a2[j]){
			j++;
		}
		else{
			if(i == 0 || a[i] ! = a[i-1]){
				result.add(a[i]);
				i++;
				j++;
			}
		}
	}
	return result;
}