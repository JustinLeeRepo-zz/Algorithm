public static class Star implements Comparable<Star>{
	private double x, y, z;

	public Star(double a, double b, double c){
		x = a;
		y = b;
		z = c;
	}

	@Override
	public static int compareTo(Star rhs){
		double rhsDistance = rhs.x * rhs.x + rhs.y * rhs.y + rhs.z * rhs.z;
		double distance = x * x + y * y + z * z;

		return distance.compareTo(rhsDistance);
	}
}

public static List<Star> kClosestStars(InputStream stars, int k){
	PriorityQueue<Star> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

	try {
		ObjectInputStream osin = new ObjectInputStream(stars);

		while(true){
			Star s = (Star) osin.readObject();
			maxHeap.add(s);

			if(maxHeap.length() == (k + 1)){
				maxHeap.remove();
			}
		}
	}

	return new List(maxHeap);

}