package adil.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheStick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,4,2,2,8};
		a=cutTheSticks(a);
		
	}

	static int[] cutTheSticks(int[] arr) {
		List<Integer> res = new ArrayList<>();
		int min = 10001;
		int max = 0;
		int k;
		for (int i = 0; i < arr.length; i++) {
			min = getMin(arr, min, max);
			k = 0;
			while (k < arr.length) {
				// arr[k] = arr[k] - min;
				if(arr[k] - min!=0) {
					arr[k]=arr[k] - min;
				}else {
					arr[k]=arr[k+1];
					
				}
				k++;
			}
			rearrangeArray(arr);
			max = getMax(arr, max);
			res.add(max);
		}
		res.add(min);
		Integer r[] = new Integer[res.size()];
		r = res.toArray(r);
		return Arrays.stream(r).mapToInt(Integer::intValue).toArray();

	}

	private static void rearrangeArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0 && arr[i+1]!=0) {
				arr[i]=arr[i+1];
			}else {
				arr[i]=arr[i+2];
			}
		}
	}

	static int getMin(int a[], int min, int max) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] < min)
				min = a[i];
		}
		return min;
	}

	static int getMax(int a[], int max) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

}
