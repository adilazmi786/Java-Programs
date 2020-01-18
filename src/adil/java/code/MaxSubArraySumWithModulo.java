package adil.java.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxSubArraySumWithModulo {

	// Complete the maximumSum function below.
	static long maximumSum(long[] a, long m) {
		long max = Long.MIN_VALUE;
		for (int i = 0; i < a.length - 1; i++) {
			long sum = a[i];
			long sum1 = a[i] + a[i + 1];
			System.out.println(i + "=>" + sum + "=>" + sum1);
			if (sum % m > max) {
				max = sum % m;
			}
			if (sum1 % m > max) {
				max = sum1 % m;
			}

		}
		if (max > a[a.length - 1] % m)
			return max;
		else
			return a[a.length - 1] % m;
	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		long a[] = { 3, 3, 9, 9, 5 };
		int m = 7;
		long result = maximumSum(a, m);
		System.out.println(result);
	}
}
