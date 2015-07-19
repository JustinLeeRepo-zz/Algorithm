public class sudokuValidate{
	public static boolean is_valid_solution(String grid){
		int[][] cellValue  = new int[9][9];

		//convert long stream string to int[][] to represent col and row of grid
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				// System.out.println(grid.charAt((i * 9) + j) + " at index " + ((i*9)+j));
				//check for invalid input
				if(!isNumeric(Character.toString(grid.charAt((i * 9) + j)))){
					// System.out.println("is not number");
					return false;
				}
				// System.out.println(Character.getNumericValue(grid.charAt((i * 9) + j)));
				if(isNumeric(Character.toString(grid.charAt((i * 9) + j))) && (Character.getNumericValue(grid.charAt((i * 9) + j)) < 1 || Character.getNumericValue(grid.charAt((i * 9) + j)) > 9)){
					// System.out.println("not within range");
					return false;
				}
				cellValue[i][j] = Character.getNumericValue(grid.charAt((i * 9) + j));
				// System.out.println(cellValue[i][j]);
			}
		}

		//check row
		for(int i = 0; i < cellValue.length; i++){
			if(isDuplicate(cellValue, i, i + 1, 0, cellValue.length, cellValue.length)){
				return false;
			}
		}

		//check col
		for(int j = 0; j < cellValue.length; j++){
			if(isDuplicate(cellValue, 0, cellValue.length, j, j + 1, cellValue.length)){
				return false;
			}
		}

		//check grid
		int gridSize = (int)Math.sqrt(cellValue.length);
		//System.out.println(gridSize);
		for(int i = 0; i < gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				//System.out.println((gridSize * i) + " " + (gridSize * (i + 1)) + " " + (gridSize * j) + " " + (gridSize * (j+1)) + " " + cellValue.length);
				if(isDuplicate(cellValue, gridSize * i, gridSize * (i + 1), gridSize * j, gridSize * (j+1), cellValue.length)){
					return false;
				}
			}
		}

		return true;
	}

	private static boolean isDuplicate(int[][] cellValue, int startRow, int endRow, int startCol, int endCol, int numElements){
		boolean[] isPresent = new boolean[numElements + 1];
		for(int i = startRow; i < endRow; i++){
			for(int j = startCol; j < endCol; j++){
				if(cellValue[i][j] != 0 && isPresent[cellValue[i][j]]){
					return true;
				}
				isPresent[cellValue[i][j]] = true;
			}
		}
		return false;
	}

	public static boolean isNumeric(String str){  
  		try {  
    		double d = Double.parseDouble(str);  
  		}  
  		catch(NumberFormatException nfe){  
    		return false;  
  		}  
  		return true;
	}


	public static void main(String[] args){
		String grid = "835416927296857431417293658569134782123678549748529163652781394981345276374962815";
		System.out.println(is_valid_solution(grid));
	}
}