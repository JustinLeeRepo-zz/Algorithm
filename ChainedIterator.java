class ChainedIterator<E> implements Iterator<E>{
	private Iterator<E> firstItr;
	private Iterator<E> secondItr;
	private Iterator<E> prev;

	public ChainedIterator(Iterator<E> first, Iterator<E> second){
		firstItr = first;
		secondItr = second;

		prev = first;
	}

	public boolean hasNext(){
		if(!prev.hasNext() && !secondItr.hasNext()){
			return false;
		}
		return true;
	}

	public E next(){
		if(!prev.hasNext() && secondItr.hasNext()){
			prev = secondItr;
			secondItr.next();
			return prev.next();
		}
		if(prev.hasNext() && firstItr.hasNext()){
			firstItr.next();
			return prev.next();
		}
	}
}