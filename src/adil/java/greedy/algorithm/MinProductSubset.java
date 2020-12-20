package adil.java.greedy.algorithm;

public class MinProductSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0,-3,-5 };
		int n = a.length;

		System.out.println(minProductSubset(a, n));
	}

	private static int minProductSubset(int[] a, int n) {
		// TODO Auto-generated method stub
		int negMax=Integer.MIN_VALUE;
		int posMin=Integer.MAX_VALUE;
		int count_neg=0;
		int count_zero=0;
		int product=1;
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				count_zero++;
				continue;
			}
			if(a[i]<0) {
				count_neg++;
				negMax=Math.max(negMax, a[i]);
			}
			if(a[i]>0 && a[i]<posMin) {
				posMin=a[i];
			}
			product*=a[i];	
		}
		if(count_zero==n || (count_zero>0 && count_neg==0))
			return 0;
		if(count_neg==0 && count_zero==0)
			return posMin;
		if(count_neg%2==0 && count_neg!=0) {
			product=product/negMax;
		}
		return product;
	}

}
