package adil.java.code;

public class ConsecutiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbaa";
		int n=2;
		System.out.println(get(str,n));
	}

	public static String get(String str, int n) {
		String res = "";
		int count = 1;
		for (int i = 0; i < str.length() -1;) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
				if (count == n) {
					res += str.charAt(i);
					count = 1;
					i=i+1;
				} else {
					res += str.charAt(i + 1);
				}
			} else {
				res += str.charAt(i + 1);
				count = 1;
				i=i+1;
			}

		}
		return res;
	}
}
