package adil.java.code;

public class RemovingCharToMakePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abebca";

		int res = palindromeAfterRemovalOfOneCharacter(str);
		if (res == -1)
			System.out.println("Not Possible");
		else if (res == -2)
			System.out.println("Possible without " + "removing any character");
		else
			System.out.println("Possible by removing" + " character at index " + res);
	}

	private static int palindromeAfterRemovalOfOneCharacter(String str) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = str.length() - 1;
		while (low < high) {
			if (str.charAt(low) == str.charAt(high)) {
				low++;
				high--;
			} else {
				if (isPalindrome(str, low + 1, high)) {
					return low;
				}
				if (isPalindrome(str, low, high - 1)) {
					return high;
				}
				return -1;
			}
		}
		return -2;
	}

	private static boolean isPalindrome(String str, int low, int high) {
		// TODO Auto-generated method stub
		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
