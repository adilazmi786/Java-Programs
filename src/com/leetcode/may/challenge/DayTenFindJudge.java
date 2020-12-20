package com.leetcode.may.challenge;

public class DayTenFindJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
		System.out.println(findJudge(3, arr));
	}

	public static int findJudge(int N, int[][] trust) {

		int n = trust.length;
		int findJudge[] = new int[N + 1];
		if (n == 1)
			return trust[0][1];
		for (int[] position : trust) {
			findJudge[position[0]]--;
			findJudge[position[1]]++;
		}
		for(int i=1;i<findJudge.length;i++) {
			if(findJudge[i]==N-1)
				return i;
		}
		return -1;
	}
}
