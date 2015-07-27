public static int Increment(int[] A){
	++A[A.length - 1];
	for(int i = A.length - 1; i > 0 && A[i] == 10; i--){
		A[i] = 0;
		A[i-1]++;
	}

	if(A[0] == 10){
		A[0] = 0;
	}
	else{
		return A; 
	}
}