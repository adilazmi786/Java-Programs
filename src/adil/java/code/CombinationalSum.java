package adil.java.code;

public class CombinationalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=8;
		int a[]= {2,4,6,8};
		int temp[]=new int[a.length];
		getCombinations(a,sum,0,temp, 0,0);
	}

	private static void getCombinations(int[] a, int actualSum,int currentSum,int temp[], int index,int j) {
		// TODO Auto-generated method stub
		if(currentSum==actualSum) {
		//	System.out.println("Found");
			printComb(temp);
			return;
		}
		for(int i=j;i<a.length;i++) {
			if((currentSum+a[i])<=actualSum) {
				temp[index]=a[i];
				getCombinations(a, actualSum, currentSum+a[i],temp, index+1,i);
				temp[index]=0;
			}
		}
	}

	private static void printComb(int[] temp) {
		// TODO Auto-generated method stub
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+",");
		}
		System.out.println();

	}

}
