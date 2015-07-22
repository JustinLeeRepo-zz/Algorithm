public static long Reverse(int x){
	boolean isNeg = (x < 0);
	long result = 0;
	x_remaining = abs(x);
	while(x_remaining > 0){
		result = result * 10 + x_remaining % 10;
		x_remaining = x_remaining % 10;
	}
	return result;
}