package adil.lambda.expression;

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MaxAndOperator {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt(); // Reading input from STDIN
		int max = -1;
		for (int i = 0; i < t; i++) {
			int a = s.nextInt(); // Reading input from STDIN
			int b = s.nextInt();
			System.out.println(getMaxResultUsingAndOperator(a,b,0));

			/*for (int k = a; k < b; k++) {
				for (int j = k + 1; j < b; j++) {
					int res = k & j;
					if (max < res)
						max = res;
				}
			}*/
		}
	//1	System.out.println(max);

		// Write your code here

	}

	private static int getMaxResultUsingAndOperator(int a, int b, int res) {
		// TODO Auto-generated method stub
		if(a>=b)
			return res ;
		if(res< (a & (a+1))) {
			res=a & (a+1);
		}
		return getMaxResultUsingAndOperator(a+1, b,res);		
	}
}
