package adil.java.code;

public class MadePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="accbca";
	    str=getPalindrome(str.toCharArray(),str.length()-1);
	    System.out.println("Resulted palinrome: "+str);
		
	    MadePalindrome p=new MadePalindrome();
	    
	    System.out.println(p.getPalindrome(str.toCharArray(), str.length()-1));
	}

	private static String getPalindrome(char[] a, int l) {
		// TODO Auto-generated method stub
		for(int i=0,j=l;i<j;i++,j--) {
			if(a[i]!=a[j]) {
				a[j]=a[i];
			}
		}
		return new String(a);
	}

}
