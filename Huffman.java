public static class Symbol{
	public double freq;
	public char s;
	public String bitPattern;

	public static class BTree extends Comparable<Btree>{
		public double freq;
		public Symbol s;
		public BTree left, right;
		@override
		public int compareTo(BTree b){
			return Double.compare(freq, b.freq);
		}
	}

}