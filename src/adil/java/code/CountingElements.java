package adil.java.code;

import java.util.Arrays;
import java.util.HashMap;

public class CountingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 3, 5, 0 };
		System.out.println(countElements(arr));
	}

	public static int countElements(int[] arr) {
		int count = 0;
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		HashMap<Integer, Boolean> isExistMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!isExistMap.containsKey(arr[i]) && map.containsKey(arr[i] + 1)) {
				if (map.get(arr[i]) >= map.get(arr[i] + 1)) {
					count += map.get(arr[i]);
				} else {
					count += Math.min(map.get(arr[i]), map.get(arr[i] + 1));
				}
				isExistMap.put(arr[i], true);
			}
		}
		return count;
	}
}
