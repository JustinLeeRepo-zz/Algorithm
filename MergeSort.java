public void mergeSort(int[] array){
	int[] helper = new int[array.length];
	mergeSort(array, helper, 0, array.length - 1);
}

public void mergeSort(int[] array, int[] helper, int low, int high){
	if(low < high){
		int middle = (low + high) / 2;
		mergeSort(array, helper, low, middle);
		mergeSort(array, helper, middle + 1, high);
		merge(array, helper, low, middle, high); // merge the two divided and conquered subarrays
	}
}

public void merge(int[] array, int[] helper, int low, int mid, int high){
	for(int i = low; i <= high; i++){
		helper[i] = array[i];
	}

	int helperLeft = low;
	int helperRight = mid + 1;
	int current = low;

	while(helperLeft <= mid && helperRight <= high){
		if(helper[helperLeft] <= helper[helperRight]){
			array[current] = helper[helperLeft];
			helperLeft++;
		}
		else{
			array[current] = helper[helperRight];
			helperRight++;
		}
		current++;
	}

	int remaining = mid - helperLeft;
	for(int i = 0; i <= remaining; i++){
		array[current + i] = helper[helperLeft + i];
	}
}