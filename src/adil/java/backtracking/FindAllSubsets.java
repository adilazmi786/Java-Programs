package adil.java.backtracking;

public class FindAllSubsets {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int temp[]=new int[a.length];
		getSubsets(a,a.length,0,temp,0);
		System.out.println(count);
	}

	private static void getSubsets(int[] a, int length, int index,int temp[],int j) {
		// TODO Auto-generated method stub
		printRes(temp);
		count++;
		if(index>=length)
		{
			return ;
		}
		for(int i=j;i<length;i++) {
			temp[index]=a[i];
			getSubsets(a, length, index+1,temp,i+1);
			temp[index]=0;

		}
		
	}
	private static void printRes(int[] temp) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0)
			System.out.print(temp[i]+" ");
		}
		System.out.println();

	}

}
