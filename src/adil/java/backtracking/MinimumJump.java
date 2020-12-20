package adil.java.backtracking;

public class MinimumJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,0,1,0,4};
		System.out.println(canJump(nums));
	}

	public static boolean canJumpFromPosition(int position, int[] nums) {
		if (position == nums.length - 1) {
			return true;
		}

		int furthestJump = Math.min(position + nums[position], nums.length - 1);
		for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
			if (canJumpFromPosition(nextPosition, nums)) {
				return true;
			}
		}

		return false;
	}

	public static boolean canJump(int[] nums) {
		return canJumpFromPosition(0, nums);
	}
}
