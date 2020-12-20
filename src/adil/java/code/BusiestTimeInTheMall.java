package adil.java.code;

public class BusiestTimeInTheMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[][] = { 
				{1487799425,14,1},
				{1487799425,4,1},
				{1487799425,2,1},
				{1487800378,10,1},
				{1487801478,18,1},
				{1487901013,1,1},
				{1487901211,7,1},
				{1487901211,7,1}
				};

		System.out.println(findBusiestPeriod(data));
	}

	static int findBusiestPeriod(int[][] data) {
		// your code goes here
		int n = data.length;
		int max = Integer.MIN_VALUE;
		int count = 0;
		int time = 0;
		if (n == 1) {
			return data[0][0];
		}
		for (int i = 0; i < n ; i++) {
			if (data[i][2] == 1) {
				count += data[i][1];
			} else if (data[i][2] == 0) {
				count -= data[i][1];
			}
			if (i < n - 1 && data[i][0] == data[i + 1][0])
				continue;
			if (count > max) {
				max = count;
				time = data[i][0];
			}
			System.out.println(i);
		}
		return time;
	}

}
