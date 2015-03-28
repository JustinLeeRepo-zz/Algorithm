public class myQueue<T>{
	Stack<t> newStack, oldStack;

	public myQueue(){
		newStack = new Stack<T>();
		oldStack = new Stack<T>();
	}

	public int size(){
		return newStack.size() + oldStack.size();
	}

	public void enqueue(T value){
	}

	public T deque(){

	}

	public T peek(){

	}
}