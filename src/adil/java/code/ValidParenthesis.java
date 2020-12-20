package adil.java.code;

import java.util.HashMap;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkValidString("()"));
	}
	public static boolean checkValidString(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		int n1=0;int n2=0;int n3=0;
		if(map.containsKey('('))
		 n1 = map.get(')');
		if(map.containsKey(')'))
		 n2 = map.get('(');
		
		if(map.containsKey('*'))
		 n3 = map.get('*');
		if ((n1 + n2 + n3) % 2 == 0)
			return true;
		return false;
	}
}
