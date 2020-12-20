package adil.java.dynamic_programing.algorithm;

public class MinimumNumberOfWaysCoinExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coins[] = { 1, 5, 6, 9 };
		int n = coins.length;
		int sum = 10;
		int res = minimumNumberOfWaysCoinExchange(coins, n, sum);
		System.out.print(res);
	}

	private static int minimumNumberOfWaysCoinExchange(int[] coins, int n, int sum) {
		// TODO Auto-generated method stub
		int dp[][] = new int[n + 1][sum + 1];
		for(int i=1;i<=sum;i++) {
			dp[0][i]=i;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (coins[i - 1] > j)
					dp[i][j] = dp[i - 1][j];
				else {
					dp[i][j] = Math.min(dp[i - 1][j], 1+dp[i][j - coins[i - 1]]);
				}
			}
		}
		return dp[n][sum];
	}

}
