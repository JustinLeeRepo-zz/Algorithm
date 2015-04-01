int swapEvenOddBit(int n){
	return ((10101010 & n) >> 1) | ((01010101 & n) << 1);
}