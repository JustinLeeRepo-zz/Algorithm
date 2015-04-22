public class Queue{
	private Stack<Integer> a = new Stack<>();
	private Stack<Integer> b = new Stack<>();

	public void enqueue(int value){
		a.push(value);
	}

	public int dequeue(){
		if(b.isEmpty()){
			while(!a.isEmpty()){
				b.push(a.pop());
			}
		}

		if(!b.isEmpty()){
			return b.pop();
		}

		throw new exception("empty queue");
	}
}