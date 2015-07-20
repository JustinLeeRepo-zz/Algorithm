public static short Parity(long x){
	short result = 0;
	while (x != 0){
		result = result ^ (x & 1); //result = result ^ 1
		x = x >> 1; // x = x & (x - 1)
	}
	return result;
}