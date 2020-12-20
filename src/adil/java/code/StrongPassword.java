package adil.java.code;

import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumNumber(5, "z0%Zb"));
	}

	static int minimumNumber(int n, String password) {
		int count = 0;
		int l=6;
		// Return the minimum number of characters to make the password strong
		Pattern regex = Pattern.compile("[-!@#$%^&*()+]");
		Pattern upper = Pattern.compile("[A-Z]");
		Pattern lower = Pattern.compile("[a-z]");
		Pattern digit = Pattern.compile("[0-9]");

		if (!regex.matcher(password).find())
			count++;
		if (!upper.matcher(password).find())
			count++;
		if (!lower.matcher(password).find())
			count++;
		if (!digit.matcher(password).find())
			count++;
		if(l>(n+count))
		count += Math.abs(l - (count + n));
			
		return count;
	}

}
