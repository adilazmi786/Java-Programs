package adil.java.code;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int arr[] = { 2, 6, 3, 12, 56, 8 };
		int n = arr.length;
		kSort(arr, n, k);
		System.out.println("Following is sorted array");
		printArray(arr, n);
	}

	private static void kSort(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k + 1; i++) {
			pq.add(arr[i]);
		}
		System.out.println("K Min heap:" + pq);
		int index = 0;
		for (int i = k + 1; i < n; i++) {
			arr[index++] = pq.peek();
			pq.poll();
			pq.add(arr[i]);
		}
		System.out.println("After Manipulation");
		System.out.println("Heap is" + pq);
		Iterator<Integer> itr = pq.iterator();
		while (itr.hasNext()) {
			arr[index++] = pq.peek();
			pq.poll();
		}
	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
