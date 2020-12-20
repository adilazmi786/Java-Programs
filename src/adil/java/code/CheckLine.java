package adil.java.code;

public class CheckLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
		System.out.println(checkStraightLine(c));
	}

	public static boolean checkStraightLine(int[][] c) {
		int n = c.length;
		if (n == 2)
			return true;
		// int y=coordinates[0].length;
		for (int i = 0; i < n - 3; i++) {
			int x1 = c[i][0];
			int y1 = c[i][1];
			int x2 = c[i + 1][0];
			int y2 = c[i + 1][1];
			int x3 = c[i + 2][0];
			int y3 = c[i + 2][1];
			if (!checkLine(x1, y1, x2, y2, x3, y3)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkLine(int x1, int y1, int x2, int y2, int x3, int y3) {
		double res1 =  ((double)(y2 - y1) / (x2 - x1));
		double res2 =  ((double)(y3 - y2) / (x3 - x2));
		if (res1 != res2)
			return false;
		return true;
	}
}
