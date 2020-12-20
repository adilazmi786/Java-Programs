package adil.java.dynamic_programing.algorithm;

public class CoinExchangeProblemNumberOfWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = { 2, 3, 5, 10 };
		int n = coins.length;
		int sum = 15;
		int res = numberOfWaysCoinExchange(coins, n, sum);
		System.out.print(res);
	}

	private static int numberOfWaysCoinExchange(int[] coins, int n, int sum) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int dp[][] = new int[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (coins[i - 1] > j)
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
			}
			
		}
		return dp[n][sum];
	}

}
