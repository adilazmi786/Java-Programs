package adil.java.code;

public class SherlockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = squares(35, 78);
		System.out.println(result);
	}

	static int squares(int a, int b) {
		int i = 1;
		double c = (double) a;
		int count = 0;
		double res=c%Math.sqrt(c);
		while ( res != 0.0) {
			c = c + 1;
			res=c%Math.sqrt(c);
		}
		i = (int) Math.sqrt(c);
		while (i * i <= b && i * i >= a) {
			count++;
			i++;
		}
		return count;
	}
}
