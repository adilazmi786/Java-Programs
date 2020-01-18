package adil.java.backtracking;

public class CountPossiblePathsBetweenTwoVertices {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 0, 1, 1, 0, 1 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 } };
		count = findPaths(a, 5, 5, 0, 4);
		System.out.println(count);
	}

	private static int findPaths(int[][] a, int row, int col, int source, int dest) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (source == dest) {
			return 1;
		} else {
			for (int j = 0; j < col; j++) {
				if (a[source][j] == 1) {
					sum += findPaths(a, row, col, j, dest);

				}
			}
		}
		return sum;
	}

}
