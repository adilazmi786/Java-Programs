package com.leetcode.may.challenge;

public class DecodedString_AtIndex {

	public static void main(String[] args) {
		System.out.println(decodeAtIndex("a2b3c4d5e6f7g8h9", 40));
	}

	public static String decodeAtIndex(String S, int K) {
		int l = S.length();
		long size = 0;
		for (int i = 0; i < l; i++) {
			char c = S.charAt(i);
			if (Character.isDigit(c)) {
				size *= c - '0';
			} else {
				size++;
			}
		}
		for (int i = l - 1; i >= 0; --i) {
			char c = S.charAt(i);
			K %= size;
			if (K == 0 && Character.isLetter(c)) {
				return Character.toString(c);
			}
			if (Character.isDigit(c)) {
				size /= c - '0';
			} else {
				size--;
			}
		}
		throw null;
	}
}
