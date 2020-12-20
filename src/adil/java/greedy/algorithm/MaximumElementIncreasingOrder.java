package adil.java.greedy.algorithm;

public class MaximumElementIncreasingOrder {

	static int arr[][] = { { 1, 7, 3, 4 }, { 4, 2, 5, 1 }, { 9, 5, 1, 8 } };
	static int M = arr[0].length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = arr.length;
		System.out.print(maximumSum(arr, n));
	}

	private static int maximumSum(int[][] arr2, int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		int max = 0;
		for (int i = n - 1; i >= 0; i--) {
			max = maxElement(arr2, i, n, max);
			if (max == 0) {
				return 0;
			}
			sum += max;
		}
		return sum;
	}

	private static int maxElement(int[][] arr, int row, int n, int max) {
		// TODO Auto-generated method stub
		boolean hasMax = false;
		int localMax = Integer.MIN_VALUE;
		for (int i = 0; i < M; i++) {
			if (arr[row][i] > localMax && (max == 0 || arr[row][i] < max)) {
				localMax = arr[row][i];
				hasMax = true;
			}
		}
		if (!hasMax)
			return 0;
		return localMax;
	}

}
