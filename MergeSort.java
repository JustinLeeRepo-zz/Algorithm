public void mergeSort(int[] array){
	int[] helper = new int[array.length];
	mergeSort(array, helper, 0, array.length - 1);
}

public void mergeSort(int[] array, int[] helper, int low, int high){
	if(low < high){
		int middle = (low + high) / 2;
		mergeSort();
		mergeSort;
		merge(); // merge the two divided and conquered subarrays
	}
}

public void merge(int[] array, int[] helper, int low, int mid, int high){

}