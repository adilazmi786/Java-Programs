package adil.java.backtracking;

public class SubStringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="12243660";
		checkSubStringSum(str);
	}

	private static void checkSubStringSum(String str) {
		// TODO Auto-generated method stub
		boolean isCall=false;
		for(int i=1;i<str.length();i++) {
			for(int j=1;i+j<str.length();j++) {
				if(find(str,0,i,j))
					{
						System.out.println("1");
						isCall=true;
						break;
					}
			}
		}
		if(!isCall)
			System.out.println(">>>>>>>>> Can' be a sum");
	}

	private static boolean find(String str, int start, int i, int j) {
		// TODO Auto-generated method stub
		
		String str1=str.substring(start,start+i);
		String str2=str.substring(start+i, start+i+j);
		String strRes=getResString(str1,str2);
		int strResSize=strRes.length();
		if(strResSize>str.length()-i-j-start)
			return false;
		String compStr=str.substring(start+i+j,start+i+j+strResSize);
		if(strRes.equals(compStr)) {
			if(start+i+j+strResSize==str.length()) {
				return true;
			}
			return find(str,start+i,j,strResSize);
		}
		return false;
	}

	private static String getResString(String str1, String str2) {
		// TODO Auto-generated method stub
		String res=String.valueOf(Long.valueOf(str1)+Long.valueOf(str2));
		return res;
	}

}
