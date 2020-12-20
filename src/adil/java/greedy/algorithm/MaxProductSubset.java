package adil.java.greedy.algorithm;

import adil.java.code.NewYearChaos;

public class MaxProductSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {  -2, -2, -3,4};
		int n = a.length;

		System.out.println(maxProductSubset(a, n));
	}

	private static int maxProductSubset(int[] a, int n) {
		// TODO Auto-generated method stub
		int negMin = Integer.MIN_VALUE;
		int posMax = Integer.MIN_VALUE;
		int zeroCount = 0;
		int negCount = 0;
		int posCount=0;
		int product=1;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				zeroCount++;
				continue;
			}
			if(a[i]<0) {
				negCount++;
				negMin=Math.max(negMin, a[i]);
			}
			if(a[i]>0) {
				posCount++;
			}
			product*=a[i];

		}
		if(posCount==0 && zeroCount>0) {
			return 0;
		}else if(posCount==0 && zeroCount==0) {
			return negMin;
		}
		else if(negCount%2==0 && zeroCount==0)
			return product;
		else if(negCount%2!=0 && negCount!=0) {
			product=product/negMin;
		}
		return product;
	}

}
