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
		if(oldStack.isEmpty()){
			while(newStack != null){
				int swap = newStack.pop();
				oldStack.push(swap);
			}
		}
		return oldStack.push();
	}

	public T peek(){
		if(oldStack.isEmpty()){
			while(newStack != null){
				int swap = newStack.pop();
				oldStack.push(swap);
			}
		}
		return oldStack.peek();
	}
}