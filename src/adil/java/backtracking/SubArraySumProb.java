package adil.java.backtracking;

public class SubArraySumProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,9,6};
		getSubArraySumEquality(a,a.length-1);
	}

	private static void getSubArraySumEquality(int[] a, int l) {
		// TODO Auto-generated method stub
		int sum1=a[0];
		int sum2=a[l];
		int start=0;int end=0;
		for(int i=0,j=l;i<j;) {
			
			if(sum1==sum2) {
				start=i;
				end=j;
				printSubArray(start,end,a);
				i++;
				sum1+=a[i];
				//break;
			}
			else if(sum1>sum2) {
				j--;
				sum2+=a[j];
			}else {
				i++;
				sum1+=a[i];
			}
		}
	}

	private static void printSubArray(int i, int j,int a[]) {
		// TODO Auto-generated method stub
		System.out.print("{");
		for(int k=0;k<=i;k++)
			System.out.print(a[k]+" ");
		System.out.print("}");

		System.out.println();
		System.out.print("{");
		for(int k=j;k<=a.length-1;k++)
			System.out.print(a[k]+" ");
		System.out.print("}");

	}

}
