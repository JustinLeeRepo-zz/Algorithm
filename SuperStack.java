public class SuperStack{
	private static ArrayList<Integer> stack = new ArrayList<Integer>();

	public static String push(int val){
		stack.add(val);
		return String.valueOf(stack.get(stack.size() - 1));
	}

	public static int pop(){

	}

	public static void inc(int numElem, int incVal){

	}

	public static void main(String[] args){
		
	}
}