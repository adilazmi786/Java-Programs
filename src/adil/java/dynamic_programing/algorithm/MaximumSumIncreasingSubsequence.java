package adil.java.dynamic_programing.algorithm;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 100, 4, 5, 150, 6 };
		int n = arr.length;
		System.out.println("Maximum sum of increasing subsequence " + maximumSumIncreasingSubsequence(arr, n) + "\n");
		
		System.out.println("Maximum product of increasing subsequence " + maximumProductIncreasingSubsequence(arr, n) + "\n");

	}

	private static int maximumProductIncreasingSubsequence(int[] arr, int n) {
		// TODO Auto-generated method stub
		int lis[] = new int[n];
		int max = -1;
		for (int i = 0; i < n; i++)
			lis[i] = arr[i];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] * arr[i]) {
					lis[i] = lis[j] * arr[i];
				}
			}
		}
		for (int i = 0; i < lis.length; i++) {
			max = Math.max(lis[i], max);
		}
		return max;
	}

	private static int maximumSumIncreasingSubsequence(int[] arr, int n) {
		// TODO Auto-generated method stub
		int lis[] = new int[n];
		int max = -1;
		for (int i = 0; i < n; i++)
			lis[i] = arr[i];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + arr[i]) {
					lis[i] = lis[j] + arr[i];
				}
			}
		}
		for (int i = 0; i < lis.length; i++) {
			max = Math.max(lis[i], max);
		}
		return max;
	}

}
