package adil.java.code;

import java.io.*;

public class StringCombinationLength {

	// Complete the substrCount function below.
	/*
	 * static long substrCount(int n, String s, int i, int count) { if (n == 1)
	 * return 1;
	 * 
	 * if(n==i) return count + (long)n;
	 * 
	 * for (int k = i ; k < n-2; k++) { if (s.charAt(k) == s.charAt(k+1) ||
	 * s.charAt(k) == s.charAt(k+2)) count++; } return substrCount(n, s, i+1,
	 * count); }
	 */

	static long substrCount(int n, String s) {
		long count = 0;
		String res = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 2; j <= n; j++) {
				res = s.substring(i, j);
				if (isSafe(res)) {
					count = count + 1;
					System.out.println(res + "=>" + (count));
				}
			}
		}
		return count + (long) n ;
	}

	private static boolean isSafe(String res) {
		boolean check=false;
		if (res.length() == 1)
			return true;
		if (res.length() == 2) {
			if (res.charAt(0) != res.charAt(1))
				return false;
		}
		for (int i = 0; i < res.length() - 2; i++) {
			if (res.charAt(i) != res.charAt(i + 1) && res.charAt(i) != res.charAt(i + 2)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {

		String s = "abcbaba";

		// long result = substrCount(s.length(), s, 0, 0);
		long result = substrCount(s.length(), s);

		System.out.println(result);
	}
}
