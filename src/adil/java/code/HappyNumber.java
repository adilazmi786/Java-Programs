package adil.java.code;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(7));
	}

	public static boolean isHappy(int n) {

		int temp = 0;
		int rem = 0;
		  if(n==1)
	            return true;
	        if(n<10 && n>1)
	            return false;
		while (n > 10) {
		
			temp = n;
			rem = 0;
			while (true) {
				rem += Math.pow(temp % 10, 2);
				temp = temp / 10;
				if (temp < 10) {
					rem += Math.pow(temp % 10, 2);
					break;
				}

			}
			n = rem;
			if (rem == 1)
				return true;
		}
		return false;
	}
}