class ChainedIterator<E> implements Iterator<E>{
	private Iterator<E> firstItr;
	private Iterator<E> secondItr;
	private Iterator<E> prev;

	ChainedIterator(Iterator<E> first, Iterator<E> second){
		firstItr = first;
		secondItr = second;
	}
}