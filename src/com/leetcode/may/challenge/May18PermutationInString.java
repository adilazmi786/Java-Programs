package com.leetcode.may.challenge;

public class May18PermutationInString {

	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));
	}

	private static boolean checkInclusion(String s1, String s2) {
		// TODO Auto-generated method stub
		int s1map[] = new int[26];
		int s2map[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			s1map[s1.charAt(i) - 'a']++;
			s2map[s2.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s2.length() - s1.length(); i++) {
			if (matches(s1map, s2map)) {
				return true;
			}
			s2map[s2.charAt(i + s1.length()) - 'a']++;
			s2map[s2.charAt(i) - 'a']--;
		}

		return matches(s1map, s2map);

	}

	private static boolean matches(int[] s1map, int[] s2map) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 26; i++) {
			if (s1map[i] != s2map[i]) {
				return false;
			}
		}
		return true;
	}
}
