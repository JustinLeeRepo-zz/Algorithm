public static int oddManOut(int[] arr){
	Set<Integer> s = new HashSet<Integer>();
	int sum = 0;
	for(int i = 0; i < arr.length; i++){
		if(s.conatains(arr[i])){
			sum -= arr[i];
		}
		else{
			s.add(arr[i]);
			sum += arr[i];
		}
	}
	return ;
}