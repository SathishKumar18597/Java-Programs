package BasicPrograms;

public class Sum_Adjacent_2DElements {
	static final int Row = 3;
	static final int Col = 3;

	public int sum(int grid[][], int row, int col) {
		int[] nbrRow = { -1, 0, 0, 1 };
		int[] nbrCol = { 0, -1, 1, 0 };
		int sumation = 0;
		for (int k = 0; k < 4; k++) {
			int row1 = row + nbrRow[k];
			int col1 = col + nbrCol[k];
			if ((row1 < Row) && (col1 < Col) && (row1 >= 0) && (col1 >= 0))
				sumation += grid[row1][col1];
		}

		return sumation;
	}

	public void AdjacentSum(int grid[][]) {

		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Col; j++) {
				int count = 0;
				count = count + sum(grid, i, j);
				if (count > 10)
					System.out.print(count + " ");
			}
		}

	}

	public static void main(String[] args) {
		int[][] grid = { { 5, 4, 1 }, { 6, 3, 5 }, { 7, 6, 4 } };
		Sum_Adjacent_2DElements ref = new Sum_Adjacent_2DElements();
		ref.AdjacentSum(grid);
	}

}
