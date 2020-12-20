package adil.java.backtracking;

public class IsSubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = { 3, 34, 4, 12, 10, 1 };
		int n = set.length;
		int sum = 9;
		if (isSubsetSum(set, n, sum, 0) == true)
			System.out.println("Found");
		else
			System.out.println("No");
	}

	private static boolean isSubsetSum(int[] set, int n, int sum, int index) {
		// TODO Auto-generated method stub
		if (sum == 0)
			return true;
		if (sum < 0)
			return false;
		for (int i = index; i < n; i++) {
			if (isSubsetSum(set, n, sum - set[i], i + 1))
				return true;
		}
		return false;
	}

}
