package adil.java.dynamic_programing.algorithm;

public class MinJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 2, 3, 1, 1, 4 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {

		int[] dp = new int[nums.length];
		dp[nums.length - 1] = 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			int fJump = Math.min(i + nums[i], nums.length - 1);
			for (int j = i + 1; j <= fJump; j++) {
				if (dp[j] == 1) {
					dp[i] = 1;
					break;
				}
			}
		}
		return dp[0] == 1;
	}
}
