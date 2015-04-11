public class LRUCache{
	private capacity;
	private Map<Integer, Pair<LinkedListNode<Integer>, Integer>> hash = new HashMap<>();
	private LinkedList<Integer> lruQueue = new LinkedList<>();

	public LRUCache(int c ){
		capacity = c;
	}

	public void moveToFront(int isbn, Pair<LinkedListNode<Integer>, Integer> it){
		lruQueue.remove(it.getFirst());
		lruQueue.addFront(isbn);
		it.setFirst(lruQueue.front());
	}

	public boolean lookUp(int isbn){
		Pair<LinkedListNode<Integer>, Integer> it = hash.get(isbn);
		if(it == null){
			return false;
		}

		moveToFront(isbn, it);
		return true;
	}

	public void insert(int isbn, int price){
		Pair<LinkedListNode<Integer>, Integer> it = hash.get(isbn);
		if(it != null){
			moveToFront(isbn, it);
		}
		else{
			if(hash.size() == capacity){
				hash.remove(lruQueue.back());
			}
			hash.put(isbn, new Pair(lruQueue.addFront(isbn), price));
		}
	}

	public boolean erase(int isbn){
		Pair<LinkedListNode<Integer>, Integer> it = hash.get(isbn);
		if(it == null){
			return false;
		}
		lruQueue.remove(it.getFirst());
		hash.remove(isbn);
		return true;
	}
}