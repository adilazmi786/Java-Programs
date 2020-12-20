package adil.java.dynamic_programing.algorithm;

public class FindMaxSubArrayWithEqualNumberOfZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,0,1,0,0,0,1,1};
		int res=findMaxLengths(nums);
		System.out.println(res);
	}

	private static int findMaxLengths(int[] nums) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<nums.length-1;i=i+2) {
			if((nums[i]==1 && nums[i]==nums[i+1]) ||(nums[i]==0 && nums[i]==nums[i+1])||(nums[i]==0  && nums[i+1]==1) ||(nums[i]==1  && nums[i+1]==0) ) {
				count=count+2;
			}
		}
		return count;
	}

	public static int findMaxLength(int[] nums) {

		int dp[] = new int[nums.length];
		for (int i = 1; i <= nums.length; i=i+2) {
			for (int j = i-1; j < i+1; j=j+2) {
				if (((nums[i] == 0 && nums[j] == 1) || (nums[i] == 1 && nums[j] == 0)) && dp[i] < dp[j] + 2) {
					dp[i] = dp[i] + 2;
				}

			}
		}
		int max = 1;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(dp[i], max);
		}
		return max;
	}
}
