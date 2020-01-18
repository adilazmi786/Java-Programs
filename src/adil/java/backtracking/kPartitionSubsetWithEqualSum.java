package adil.java.backtracking;

import java.util.HashMap;

public class kPartitionSubsetWithEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap();
		
		int a[] = { 1, 1, 2, 2, 3, 4, 5, 6 };
		int k = 3;
		int subsetSum = 0;
		for (int i = 0; i < a.length; i++) {
			subsetSum += a[i];
		}
		subsetSum = subsetSum / k;

		generateSubset(a, a.length, k, subsetSum, hmap);
	}

	private static void generateSubset(int[] a, int l, int k, int subsetSum, HashMap<Integer, String> hmap) {
		// TODO Auto-generated method stub
		int sum = 0;
		boolean visited[] = new boolean[l];
		for (int i = 0; i < l; i++) {
			visited[i] = false;
		}
		int count = 0, m = 0;
		String res = "";
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (a[i] == subsetSum) {
					sum = a[i];
					res = a[i] + "";
				} else {
					if (a[i] == a[j]) {
					} else {
						sum = a[i] + a[j];
						res = a[i] + "," + a[j];
					}
				}
				if (sum == subsetSum && visited[i] == false && visited[j] == false) {
					hmap.put(m++, res);
					count++;
					visited[j] = true;
					visited[i] = true;
				}
			}
		}
		if (count == k && k < l)
			for (Integer i : hmap.keySet()) {
				System.out.println(hmap.get(i));
			}
		else {
			System.out.println("No");
		}
	}

}
