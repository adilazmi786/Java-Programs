package adil.java.backtracking;

public class LongestPossibleRouteWithoutHurdles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = 
		    { 
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
		        { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 }, 
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } 
		    }; 
		finPath(mat,3,10,0,0,0);
	}

	private static void finPath(int[][] mat, int row, int col,int i,int j,int count) {
		// TODO Auto-generated method stub
			
		if(mat[i][j]==1)
			count++;
			
		
	}

}
