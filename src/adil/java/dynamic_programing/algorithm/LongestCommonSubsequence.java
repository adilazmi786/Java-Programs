package adil.java.dynamic_programing.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde"; 
	    String s2 = "ace"; 
	  
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int m = X.length; 
	    int n = Y.length; 
	  
	    System.out.println("Length of LCS is" + " " + 
	                                  lcs( X, Y, m, n ) ); 
	}

	private static int lcs(char[] str1, char[] str2, int m, int n) {
		// TODO Auto-generated method stub
		int dp[][]=new int[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(str1[i-1]==str2[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}

}
