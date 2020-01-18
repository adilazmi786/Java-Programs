package adil.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < a.size(); i++) {
			res.add(i,0);
		}
		for (int j = 0; j < a.size(); j++) {
			for (int i = j; i < a.size(); i++) {
				int n = (a.get(j)) * (a.get(i));
				if (res.get(i) != n && res.get(i)==0)
					res.set(i,n);
				else
					res.add(i,n);

			}
		}
		int count = 0;
		for (int i = 0; i < b.size(); i++) {
			for (int j = 0; j < res.size(); j++) {
				if (((b.get(i)) % (res.get(j)) == 0))
					count++;
			}
		}
		return count;
	}

}

public class BetweenTwoSets {
	public static void main(String[] args) {

		int n = 2;
		int m = 3;
		List<Integer> arr = new ArrayList<>(Arrays.asList(2, 4));
		List<Integer> brr = new ArrayList<>(Arrays.asList(16, 32, 96));

		int total = Result.getTotalX(arr, brr);
		System.out.println(total);
	}
}
