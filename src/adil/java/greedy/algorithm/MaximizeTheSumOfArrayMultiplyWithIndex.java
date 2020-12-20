package adil.java.greedy.algorithm;

import java.util.Arrays;

public class MaximizeTheSumOfArrayMultiplyWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 3, 5, 6, 1 }; 
		    int n = arr.length; 
		  
		    System.out.println(maxSum(arr, n)); 
	}

	private static int maxSum(int[] arr, int n) {
		Arrays.sort(arr);
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i]*i;
		}
		return sum;
	}

}
