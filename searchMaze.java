public static class Coordinate{
	public int x;
	public int y;

	public Coordinate(int a, int b){
		x = a;
		y = b;
	}
}

public static LinkedList<Coordinate> searchMaze(int[][] maze, Coordinate s, Coordinate e){
	LinkedList<Coordinate> result = new LinkedList<>();

	maze[s.x][s.y] = 1;
	result.addFirst(s);

}

public static boolean searchMazeHelper(int[][] maze, Coordinate current, Coordinate e, LinkedList<Coordinate> result){
	if (current == e){
		return true;
	}

	List<List<Integer>> shift = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, -1), Arrays.asList(1, 0), Arrays.asList(-1, 0));

	for(List<Integer> s : shift){
		Coordinate next = new Coordinate(current.x + s[0], current.y + s[1]);
		if(isFeasible(next, maze){
			maze[next.x][next.y] = 1;
			result.addLast(next);
			if(searchMazeHelper(maze, next, e, result)){
				return true;
			}
			result.removeLast();
		}
	}
	return false;

}

public static boolean isFeasible(Coordinate current, int[][] maze){
	return current.x >= 0 && current.y >= 0 && current.x < maze.length && current.y < maze[current.x].length && maze[current.x][current.y] == 0;
}