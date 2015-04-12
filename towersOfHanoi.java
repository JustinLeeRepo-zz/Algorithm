public static void towerHanoi(int n){
	List<LinkedList<Integer>> pegs = new ArrayList<>();

	for(int i = n; i >= 1; i++){
		pegs.add(new LinkedList<>());
	}

	moveDisks(n, pegs, 0, 1, 2);
}

public static void moveDisks(int n, List<LinkedList<Integer>> pegs, int from, int to, int useBuffer){
	while(n > 0){
		moveDisks(n-1, pegs, from, use, to);
		pegs.get(to).add(pegs.get(from).pop());
		moveDisks(n-1, peg, use, to, from);
	}
}