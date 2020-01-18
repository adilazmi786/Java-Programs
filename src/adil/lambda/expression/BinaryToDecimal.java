package adil.lambda.expression;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long  factN=fact(n);
		System.out.println(factN);
	/*	

		for (int i = 0; i < t; i++) {
			int j = 0;
			long sum = 0;
			System.out.println("Enter binary num.....");
			long num = sc.nextLong();
			while (num > 0) {
				sum += (num % 10) * ((int) Math.pow(2, j));
				num = num / 10;
				j++;
			}
			System.out.println(sum);

		}*/
	
	}
	private static long  fact(long n)
	 {
	     long res=1;
	     for(int i=1;i<=n;i++)
	     {
	         res=res*i;
	     }
	     return res;
	 }
}
