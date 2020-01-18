package adil.java.code;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		char[] temp=new char[str.length()];
		getPowerSet(str.toCharArray(),str.length(),0,temp,0);
	}

	private static void getPowerSet(char[] ar, int length, int index,char temp[],int j) {
		// TODO Auto-generated method stub
		printRes(temp);
		if(index>=length) {
			return;
		}
		for(int i=j;i<length;i++) {
			temp[index]=ar[i];
			getPowerSet(ar, length, index+1, temp,i+1);
			temp[index]=' ';
		}
	}
	private static void printRes(char[] temp) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0)
			System.out.print(temp[i]+" ");
		}
		System.out.println();

	}

}
