public static int ssDecode(final String col){
	int ret = 0;
	for(char c : col.toCharArray()){
		ret = ret * 26 + c - 'A' + 1;
	}
	return ret;
}