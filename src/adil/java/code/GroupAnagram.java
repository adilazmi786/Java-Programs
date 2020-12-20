package adil.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input= {"ate","eat","tea","hire","rieh","jira"};
		List<List<String>>res=groupAnagrams(input);
		System.out.println(res);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String actualWord = strs[i];
			char[] actualWordArray = actualWord.toCharArray();
			Arrays.sort(actualWordArray);
			String newSortedWord = new String(actualWordArray);
			if (map.containsKey(newSortedWord)) {
				map.get(newSortedWord).add(actualWord);
			} else {
				List<String> words = new ArrayList<>();
				words.add(actualWord);
				map.put(newSortedWord, words);
			}
		}
		List<List<String>> resultList = new ArrayList<>();
		for (String str : map.keySet()) {
			List<String> getListOfWords = map.get(str);
			resultList.add(getListOfWords);
		}
		return resultList;
	}
}
