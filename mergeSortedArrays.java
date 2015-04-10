public static List<Integer> mergeSortedArrays(int[][] sortedArrays){
	PriorityQueue<Pair<Integer, Integer>> minHeap = new PriorityQueue(11, new Comparator<Pair<Integer, Integer>>(){
		@Override
		public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2){
			return o1.getFirst().compareTo(o2.getFirst());
		}
	});

	int[] heads = new int[sortedArrays.length];

	for(int i = 0; i < sortedArrays.length; ++i){
		if(sortedArrays[i].length > 1){
			minHeap.add(new Pair(sortedArrays[i].getFirst(), i));
			heads[i] = 1;
		}
		else{
			heads[i] = 0;
		}
	}

	List<Integer> results = new List<>();
	while(!minHeap.isEmpty()){
		int smallestEntry = minHeap.peak().getFirst();
		int[] smallestArray = sortedArrays[minHeap.peak().getSecond()];
		int smallestHead = heads[minHeap.peak().getSecond()];
		results.add(smallestEntry);

		if(smallestHead < smallestArray.length){
			minHeap.add(new Pair<>(smallestArray[smallestHead], minHeap.peak().getSecond()));
			++heads[minHeap.peak().getSecond()];
		}
		else{
			minHeap.remove();
		}
	}
	return results;
}