package adil.java.backtracking;

import java.util.HashMap;


public class MinimumUniqueCharacter {
	static HashMap<Character, Integer> count = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "abaaa";
		String B = "bbabb";
		char ch = getMinCountChar(A);
		findUniqueness(A.toCharArray(), B.toCharArray(), 0, 0, ch);
	}

	private static char getMinCountChar(String res) {
		// TODO Auto-generated method stub
		int min = 9999;
		for (int i = 0; i < res.length(); i++) {
			if (count.containsKey(res.charAt(i)))
				count.put(res.charAt(i), count.get(res.charAt(i)) + 1);
			else
				count.put(res.charAt(i), 1);

		}
		char ch1 = 0;
		for (Character ch : count.keySet()) {
			int m = count.get(ch);
			if (m < min) {
				min = m;
				ch1 = ch;
			}
		}
		return ch1;
	}

	private static void findUniqueness(char[] cs, char[] cs2, int i, int j, char ch) {
		// TODO Auto-generated method stub
		int unique=0;
		if (i > cs.length-1) {
			for(Character ch2:count.keySet())
			{
				if(count.get(ch2)>0)
					unique++;
			}
			//System.out.println(getUniqueCount(new String(cs)));
			System.out.println(unique);

			return;
		}
		if (cs[i] == ch ) {
			if(cs2[i]!=ch)
			{
				count.replace(cs2[i], count.get(cs2[i])+1);
				count.replace(cs[i], count.get(cs[i])-1);

			}

			/*else
				
			swapA(cs, cs2, i, j);*/
		}
		findUniqueness(cs, cs2, i + 1, j + 1, ch);
	}

	private static int getUniqueCount(String res) {
		// TODO Auto-generated method stub
		int unique = 0;
		int count[] = new int[26];
		for (int i = 0; i < res.length(); i++) {
			count[res.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] >= 1)
				unique++;
		}
		return unique;
	}

	private static char[] swapA(char[] a, char[] b, int i, int j) {
		// TODO Auto-generated method stub
		char temp = b[j];
		b[j] = a[i];
		a[i] = temp;
		return a;
	}

}
