package adil.java.code;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayQuadrupulet {

	static class Pair {
		int first, second;

		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int s = 20;
		int n = arr.length;
	/*	System.out.println(">>>>>>>> complexity o(n^3) approach");
		Arrays.stream(findArrayQuadruplet(arr, s)).forEach(System.out::println);

		System.out.println(">>>>>>>> complexity o(n^2 log n) approach");

		findArrayQuadrupletWithO2Logn(arr, s);
*/
		System.out.println(">>>>>>>> complexity o(n^2) approach using HashMap");

		findArrayQuadrupletWithO2HashMapApproach(arr, s, n);

	}

	private static void findArrayQuadrupletWithO2HashMapApproach(int[] arr, int s, int n) {
		// TODO Auto-generated method stub
		HashMap<Integer, Pair> mp = new HashMap<Integer, Pair>();
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				mp.put(arr[i] + arr[j], new Pair(i, j));

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				if(mp.containsKey(s-sum)) {
					Pair p=mp.get(s-sum);
					if(p.first!=i && p.second!=j && p.second!=i && p.first!=j) {
						System.out.println(arr[i]+","+arr[j]+","+arr[p.first]+","+arr[p.second]);
						return;
					}
				}
			}
		}
	}

	private static void findArrayQuadrupletWithO2Logn(int[] arr, int s) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int aux[] = new int[n * (n - 1) / 2];
		calculatePairSum(arr, aux.length, aux);
		Arrays.sort(aux);

		// System.out.println("===== Pair Sum ========");
		// Arrays.stream(aux).forEach(System.out::println);
		int low = 0;
		int high = aux.length - 1;
		System.out.println("===== Quadrupulet ========");
		while (low < high) {
			if ((aux[low] + aux[high]) < s) {
				low++;
			} else if ((aux[low] + aux[high]) > s) {
				high--;
			} else {
				System.out.println("Found:= " + aux[low] + "," + aux[high]);
				low++;
				high--;
				break;
			}
		}
	}

	private static void calculatePairSum(int[] arr, int length, int[] aux) {
		// TODO Auto-generated method stub
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				aux[k++] = (arr[i] + arr[j]);
			}
		}

	}

	static int[] findArrayQuadruplet(int[] arr, int s) {
		// your code goes here
		int res[] = new int[4];
		int l = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < l - 4; i++) {
			for (int j = i + 1; j < l - 3; j++) {
				int r = s - (arr[i] + arr[j]);
				int low = j + 1;
				int high = l - 1;
				while (low < high) {
					if (arr[low] + arr[high] < r) {
						low++;
					} else if (arr[low] + arr[high] > r) {
						high--;
					} else {
						res[0] = arr[i];
						res[1] = arr[j];
						res[2] = arr[low];
						res[3] = arr[high];
						return res;
					}
				}
			}
		}
		return res;
	}
}
