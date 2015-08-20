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
}