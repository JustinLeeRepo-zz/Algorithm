public class LargestRectangle{
	public static void solve(int[] arr){
		int maxRectangle = Integer.MIN_VALUE;
		int runningSum = -1;

		for(int i = 0; i < arr.length; i++){
			boolean isRect = false;
			runningSum = 0;

			for(int compareTo = 0; compareTo < arr.length; compareTo++){
				if(arr[i] > arr[compareTo] && isRect){
					break;
				}
			}

			maxRectangle = Math.Max(maxRectangle, runningSum);
		}
	}
}