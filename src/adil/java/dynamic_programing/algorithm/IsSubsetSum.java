package adil.java.dynamic_programing.algorithm;

public class IsSubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1 };
		int n = arr.length;
		int sum = 1;

		if (noOfSubsetSum(arr, n, sum))
			System.out.print("Found Subset YES\n");
		else
			System.out.print("NO\n");
	}

	private static boolean noOfSubsetSum(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		
		if(n==1 && sum==0)
			return false;
		int dp[][] = new int[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if(j<arr[i-1])
				 dp[i][j] = dp[i - 1][j];
				if (arr[i - 1] <= j) {
					if (dp[i-1][j] == 1)
						dp[i][j] = 1;
					else
						dp[i][j] = dp[i-1][j - arr[i-1]];
				}
			}
		}
		int count=0;
		for(int i=n;i>=0;i--) {
			if(dp[i][sum]==1) {
				count++;
			}
		}
		System.out.println(count);
		if (dp[n][sum] == 1)
			return true;
		return false;
	}

}
