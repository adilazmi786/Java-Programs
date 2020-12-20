package adil.java.backtracking;

public class IsModularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 3, 9};
		int n = arr.length;
		int m = 11;

		if (modularSum(arr, n, m, 0, 0))
			System.out.print("YES\n");
		else
			System.out.print("NO\n");
	}

	private static boolean modularSum(int[] arr, int n, int m, int index, int sum) {
		// TODO Auto-generated method stub
		if (sum!=0 && sum % m == 0)
			return true;
		if(sum!=0 && sum%m!=0 && index >= n)
			return false;
	
		for (int i = index; i < n; i++) {
			sum=sum+arr[i];
			if (modularSum(arr, n, m, i+1, sum)) {
				return true;
			}
			sum -= arr[i];
		}
		return false;
	}

}
