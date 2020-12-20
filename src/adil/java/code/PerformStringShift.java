package adil.java.code;

public class PerformStringShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int shift[][] = { { 0, 1 }, { 1, 2 } };
		s=stringShift(s, shift);
		System.out.println(s);
	}

	public static String stringShift(String s, int[][] shift) {
		for (int i = 0; i < shift.length; i++) {
			if (shift[i][0] == 0) {
				s=leftShift(s, shift[i][1]);
			} else {
				s=rightShift(s, shift[i][1]);
			}
		}
		return s;
	}

	private static String rightShift(String s, int rs) {
		// TODO Auto-generated method stub
		String res = s + s;
		String temp="";
		for (int i = s.length()-rs; i < res.length()-rs; i++) {
			temp+=res.charAt(i);
		}
		return temp;
	}

	private static String leftShift(String s, int ls) {
		// TODO Auto-generated method stub
		String res = s + s;
		String temp="";
		for (int i = ls; i < res.length()-s.length()+ls; i++) {
			temp+=res.charAt(i);
		}
		return temp;
	}
}
