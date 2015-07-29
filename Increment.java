public static int Increment(int[] A){
	++A[A.length - 1];
	for(int i = A.length - 1; i > 0 && A[i] == 10; i--){
		A[i] = 0;
		A[i-1]++;
	}

	if(A[0] == 10){
		A[0] = 0;
		int result = new int[A.length++];
		System.arrayCopy(A, 0, result, 1, A.length)
		return result;
	}
	else{
		return A; 
	}
}