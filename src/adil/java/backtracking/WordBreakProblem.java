package adil.java.backtracking;

import java.util.HashMap;

public class WordBreakProblem {

	static String dictionary[] = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i",
			"love", "ice", "cream" };
	//static String res = "";
	//static HashMap<String, Boolean> hmap=new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "iloveicecreamandmango";

		breakWord(input, 1, "");
	}

	private static void breakWord(String input, int index, String res) {
		// TODO Auto-generated method stub

		if (input.length() <= 0)
			System.out.println(res);
		int k = 0;
		for (int i = 0; i < input.length(); i++) {
			k = k + 1;
			String word = input.substring(0, k);
			if (getSplitWord(dictionary, word)) {

				breakWord(input.substring(i + 1), index, res+word+" ");

			}
		}
	}

	private static boolean getSplitWord(String[] dictionary2, String word) {
		// TODO Auto-generated method stub
		for (int i = 0; i < dictionary2.length; i++) {
			if (dictionary2[i].equals(word)) {
				//hmap.put(word, true);
				return true;
			}
		}
		return false;
	}

}
