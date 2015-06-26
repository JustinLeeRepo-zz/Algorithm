public static class Vertex implements Comparable<Vertex>{
	Pair< Integer, Integer > edge = new Pair<>(Integer.MAX_VALUE, 0);
	List< Pair< Vertex, Integer >> edges = new ArrayList<>();
	int id;
	Vertex previous = null;
	@override
	public int compareTo(Vertex v){
		int diff = edge.getFirst().compareTo(v.edge.getFirst());
		return diff;
	}
}

public static void dijkstra(Vertex s, Vertex d){
	
}