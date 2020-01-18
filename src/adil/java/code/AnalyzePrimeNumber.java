package adil.java.code;

import java.util.*;

class AnalyzePrimeNumber {
	static int temp = 0;
	static boolean flag = false;
	static int k = 1;

	public static void main(String args[]) throws Exception {

		// Scanner
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(); // Reading input from STDIN
		int b = s.nextInt();
	
		int arr[] = new int[b];
		arr[0] = a;
		if (a < b) {
			for (int i = 2; i < b / 2; i++) {
				if (i == 2 || (i % 2) != 0) {
					funAdd(a, i, b, arr);

				}
			}
		} else {
			for (int i = 2; i < a / 2; i++) {
				if (i == 2 || (i % 2) != 0) {

					funSub(a, i, b, arr);
				}
			}
		}
	}

	private static void funSub(int a, int primeNumber, int b, int arr[]) {
		// TODO Auto-generated method stub
		temp = a - primeNumber;
		arr[k++] = temp;
		if (temp == b) {
			flag = true;
			for (int i = 0; i < k; i++)
				System.out.print(arr[i] + "->");
		} 
	}

	private static void funAdd(int a, int primeNumber, int b, int arr[]) {

		// TODO Auto-generated method stub
		temp = a + primeNumber;
		arr[k++] = temp;

		if (temp == b) {
			flag = true;
			for (int i = 0; i < k; i++)
				System.out.print(arr[i] + "->");
		} 

	}
}
