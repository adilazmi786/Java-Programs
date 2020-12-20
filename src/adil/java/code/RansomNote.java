package adil.java.code;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canConstruct("aa","ab");
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] cnt = new int[26];
		for (char c : magazine.toCharArray())
			++cnt[c - 97];
		for (char c : ransomNote.toCharArray())
			if (--cnt[c - 97] < 0)
				return false;
		return true;
	}
}
