package adil.java.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.IntStream.of;

public class ClimbingTheLeaderBoard {

	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		int res[]=new int[alice.length];
		/*
		 * int rank[]=new int[alice.length]; int k=0; for(int i=0;i<alice.length;i++){
		 * rank[i]=1; for(int j=0;j<scores.length;j++){ if(alice[i]<scores[j]) {
		 * rank[i]=k++; } if(alice[i]==scores[j]) { rank[i]=j; } } k=0; } return rank;
		 */
		// 
		/*
		 * TreeSet<Integer> hset =
		 * IntStream.of(scores).boxed().collect(Collectors.toCollection(TreeSet::new));
		 * hset = (TreeSet<Integer>)hset.descendingSet();
		 * 
		 * ArrayList<Integer> sc = new ArrayList<>(hset); int rank[] = new
		 * int[sc.size()];
		 * 
		 * int k = 1; rank[0] = k; for (int i = 1; i < sc.size(); i++) { rank[i] = ++k;
		 * } int j; for (int i = 0; i < alice.length; i++) { j = 0; for (j = 0; j <
		 * sc.size(); j++) { if (alice[i] >= sc.get(j)) { alice[i] = rank[j]; break; } }
		 * if (j == sc.size()) alice[i] = rank[rank.length - 1] + 1; } return alice;
		 */
		int k=0;
		int[] array = of(scores).distinct().toArray();
		int i = array.length - 1;
		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i])
					i--;
				else {
					res[k++]=i+2;
				//	System.out.println(i + 2);
					break;
				}
			}
			if (i < 0)
				res[k]=1;
		}
		return res;
	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int scores[] = { 100, 100, 50, 40, 40, 20, 10 };
		int alice[] = { 5, 25, 50, 120 };
		int[] result = climbingLeaderboard(scores, alice);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
