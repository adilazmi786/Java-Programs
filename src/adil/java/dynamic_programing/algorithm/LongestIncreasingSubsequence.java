package adil.java.dynamic_programing.algorithm;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 22,11 }; 
        int n = arr.length; 
        System.out.println("Length of lis is " + longestIncreasingSubsequence( arr, n ) + "\n" ); 
	}

	private static int longestIncreasingSubsequence(int[] arr, int n) {
		// TODO Auto-generated method stub
		int lis[]=new int[n];
		for(int i=0;i<n;i++) {
			lis[i]=1;
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && lis[i]<lis[j]+1)
					lis[i]=lis[i]+1;
			}
		}
		int max=1;
		for(int i=0;i<lis.length;i++) {
			max=Math.max(lis[i], max);
		}
		return max;
	}

}
