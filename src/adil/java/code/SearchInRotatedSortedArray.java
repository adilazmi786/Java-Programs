package adil.java.code;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,5};
		System.out.println(search(nums,5));
	}

	public static int search(int[] nums, int target) {

		
		int a=1;
		int b=0;
		int c=a/b;
		System.out.println(c);
				

		if (nums.length == 0)
			return -1;
		
		int start = 0;
		int end = nums.length - 1;
		//int a=123451234512345;
		while (start <= end) {
			int mid = start +  (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] >= nums[start]) {
				if (target >= nums[start] && nums[mid] >= target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target >= nums[mid] && nums[end] >= target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}
}
