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