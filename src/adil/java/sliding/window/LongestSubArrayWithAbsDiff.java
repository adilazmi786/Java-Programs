package adil.java.sliding.window;

public class LongestSubArrayWithAbsDiff {

	public static void main(String args[]) {
		int a[] = { 4, 8, 5, 1, 7, 9 };
		int limit = 6;
		System.out.println(longestSubarray(a, limit));
		
	}

	public static int longestSubarray(int[] nums, int limit) {

		int i = 0;
		int j = 0;

		int min = nums[0];
		int max = nums[0];

		int ans = 0;

		while (j < nums.length) {
			min = Math.min(min, nums[j]);
			max = Math.max(max, nums[j]);
			if (Math.abs(max - min) <= limit) {
				ans = Math.max(ans, j - i + 1);
			} else {
				i++;
				while (i > 0 && nums[i - 1] == nums[i])
					i++;
				max = nums[i];
				j = i;
			}
			j++;
		}
		return ans;
	}
}
