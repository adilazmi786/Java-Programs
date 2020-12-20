package adil.java.code;

import java.util.Stack;

public class BackspaceString {

	public static void main(String[] args) {
		System.out.println(backspaceCompare("ab#c", "ad#c"));
	}

	public static boolean backspaceCompare(String S, String T) {

		String res1 = "";
		String res2 = "";
		return getBackspaceString(S, T);
	
	}

	public static Boolean getBackspaceString(String S, String T) {
		Stack<Character> sstack = new Stack<Character>();
		Stack<Character> tstack = new Stack<Character>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '#') {
				sstack.push(S.charAt(i));
			} else if (!sstack.isEmpty()) {
				sstack.pop();
			}
		}
		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) != '#') {
				tstack.push(T.charAt(i));
			} else if (!tstack.isEmpty()) {
				tstack.pop();
			}
		}
		boolean flag=true;
		if(sstack.size()!=tstack.size()) {
			return false;
		}
		while(!sstack.isEmpty()) {
			if(sstack.peek()==tstack.peek()) {
				sstack.pop();
				tstack.pop();
			}else {
				flag=false;
				break;
			}
		}
		
		return flag;
	}
}
