public class SuperStack{
	private static ArrayList<Integer> stack = new ArrayList<Integer>();

	public static String push(int val){
		stack.add(val);
		return String.valueOf(stack.get(stack.size() - 1));
	}

	public static int pop(){
		if(stack.size() > 0){
			stack.remove(stack.size() - 1);
		}

		if(stack.size() > 0)
			return String.valueOf(stack.get(stack.size() - 1));
		return "EMPTY";t
	}

	public static void inc(int numElem, int incVal){
		for(int i = 0; i < numElem; i++){
            stack.set(i, stack.get(i) + incVal);
        }
        return String.valueOf(stack.get(stack.size() - 1));
	}

	public static String validate(String[] str){
        switch(str[0]){
            case "push":
                if(str.length != 2){
                    return "ERROR: PUSH CALL USAGE";
                }
                return push(Integer.valueOf(str[1]));
            }
        }
    }

	public static void main(String[] args){

	}
}