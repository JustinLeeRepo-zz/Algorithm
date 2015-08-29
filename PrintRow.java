import java.util.ArrayList;

public class PrintRow{
	public static void printRow(ArrayList<Character> al, int N){
		int counter = 0;
		int i = 0;
		while(counter != al.size() - 1){
			if(i + N > al.size() - 1){
				System.out.println(al.get(i));
				i += N;
				i %= al.size();
				counter++;
			}
			else{
				System.out.print(al.get(i));
				i += N;
				counter++;
			}
		}
		System.out.println();
	}

	public static void main(String[] args){
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('f');
		al.add('g');

		printRow(al, 3);
	}
}