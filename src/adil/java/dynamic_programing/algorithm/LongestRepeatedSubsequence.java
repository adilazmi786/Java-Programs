package adil.java.dynamic_programing.algorithm;

public class LongestRepeatedSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabb"; 
	  
	    char[] X=s1.toCharArray(); 
	    int n = X.length; 
	  
	    System.out.println("Length of LCS is" + " " + 
	                                  longestRepeatedSubsequence( X, n ) ); 
	}

	private static int longestRepeatedSubsequence(char[] str1, int n) {
		// TODO Auto-generated method stub
		int dp[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(str1[i-1]==str1[j-1] && i!=j) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		String res="";
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(dp[i][j]==dp[i-1][j-1]+1) {
					res=res+str1[i-1];
					i--;
					j--;
				}else if(dp[i][j]==dp[i-1][j]) {
					i--;
				}else
					j--;
			}
		}
		String reverse="";
		for(int i=res.length()-1;i>=0;i--) {
			reverse+=res.charAt(i);
		}
		System.out.println(reverse);
	
		return dp[n][n];
	}

}
