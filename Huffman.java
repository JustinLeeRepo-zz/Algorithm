public static class Symbol{
	
	public static class BTree extends Comparable<Btree>{
		@override
		public int compareTo(BTree b){
			return Double.compare(freq, b.freq);
		}
	}
}