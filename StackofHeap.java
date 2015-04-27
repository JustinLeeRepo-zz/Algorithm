public class StackofHeap{
	public static class Compare implements Comparator<Pair<Integer, Integer>>{
		@Override
		public int compare(Pair<Integer, Integer> c1, Pair<Integer, Integer> c2){
			return c1.getFirst().compareTo(c2.getFirst());
		}
	}

	private int timestamp = 0;
	private PriorityQueue<Pair<Integer, Integer>> maxHeap;

	public StackofHeap(){
		maxHeap = new PriorityQueue<>(11, new compare);
	}

	public static void push(int x){
		maxHeap.add(new Pair(timestamp, x));
		timestamp++;
	}

	public static int pop(){
		if(maxHeap.peek() != null){
			return maxHeap.remove().getSecond();
		}
		else{
			return null;
		}
	}

	public static int peek(){
		return maxHeap.peek().getSecond();
	}
}