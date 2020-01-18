package adil.java.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {

		for (int i = 0; i < q.length; i++) {
			if ((q[i] - (i + 1)) > 2) {
				System.out.println("Too chaotic");
				return;
			}
		}
		long count = 0;
		for (int i = 0; i < q.length; i++) {
			for (int j = i + 1; j < q.length; j++) {
				if (q[i] > q[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int q[] = {};
		minimumBribes(q);
	}

}
