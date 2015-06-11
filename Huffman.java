static class Symbol{
	public double freq;
	public char s;
	public String bitPattern;

	public static class BTree extends Comparable<Btree>{
		double freq;
		Symbol s;
		BTree left, right;

		public BTree(double d, Symbol sym, BTree l, BTree r){
			freq = d;
			s = sym;
			left = l;
			right = r;
		}


		@override
		public int compareTo(BTree b){
			return Double.compare(freq, b.freq);
		}

		public static void huffmanEncoding(List<Symbol> symbols){
			PriorityQueue<Btree> minHeap = new PriorityQueue<>();
			
			for(Symbol s : symbols){
				
			}
		}

		public static void assign(){
			
		}
	}

}