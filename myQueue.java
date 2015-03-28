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
		newStack.push(value);
	}

	public T deque(){
		shift();
		return oldStack.push();
	}

	public T peek(){
		shift();
		return oldStack.peek();
	}
	
	public void shift(){
		if(oldStack.isEmpty()){
			while(newStack != null){
				int swap = newStack.pop();
				oldStack.push(swap);
			}
		}
	}
}