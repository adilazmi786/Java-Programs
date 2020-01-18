package adil.java.backtracking;

public class EightGridSum {

	static int k = 1;
	static int row = 3;
	static int col = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { -1, 0, 0, -1 }, { 0, 0, 0, 0 }, { -1, 0, 0, -1 } };

		boolean isGridCreated = createEigthGridSum(a, k);
		/*
		 * if (isGridCreated) printGrid(a); else System.out.println("Gird Not Created");
		 */
	}

	private static void printGrid(int[][] a) {
		// TODO Auto-generated method stub

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean createEigthGridSum(int[][] a, int k) {
		// TODO Auto-generated method stub
		if (k > 8) {
			printGrid(a);
			return true;

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == 0 && isValid(a, k - 1, i, j)) {
					a[i][j] = k;
					if (createEigthGridSum(a, k + 1))
						return true;
					a[i][j] = 0;
				}

			}
		}
		return false;
	}

	private static boolean isValid(int[][] a, int k2, int i, int j) {

		if(k2==0)
			return true;
		if (i+1 < row && a[i + 1][j] == k2)
			return false;

		if (i > 0 && a[i - 1][j] == k2)
			return false;

		if (i+1 < row && j+1 < col && a[i + 1][j + 1] == k2)
			return false;

		if (i > 0 && j > 0 && a[i - 1][j - 1] == k2)
			return false;

		if (j+1 < col && a[i][j + 1] == k2)
			return false;

		if (j > 0 && i+1 < row && a[i + 1][j - 1] == k2)
			return false;

		if (j > 0 && a[i][j - 1] == k2)
			return false;

		if (i > 0 && j+1 < col && a[i - 1][j + 1] == k2)
			return false;

		return true;
	}

}
