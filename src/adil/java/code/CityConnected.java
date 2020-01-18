package adil.java.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CityConnected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> origin = new LinkedList<>();
		origin.add(1);
		origin.add(2);
		origin.add(3);
		List<Integer> dest = new LinkedList<>();

		dest.add(4);
		dest.add(5);

		dest.add(6);

		List<Integer> res = getConnected(origin, dest, 1);
		for (Integer i : res) {
			System.out.println(i);
		}
	}

	private static List<Integer> getConnected(List<Integer> origin, List<Integer> dest, int threshold) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		List<Integer> res = new ArrayList<Integer>();
		for(Integer i:origin)
			res.add(0);
		
		for (int i = 0; i < origin.size(); i++) {
			for (int j = 0; j < dest.size(); j++) {
				if (origin.get(i) < dest.get(j)) {
					a = origin.get(i);
					b = dest.get(j);
				} else {

					b = origin.get(i);
					a = dest.get(j);
				}
				int hcf = hcfFun(a, b);
				if (hcf > threshold  && res.get(i) != 1) {
					res.set(i, 1);
				}
				
			}
		}
		return res;
	}

	private static int hcfFun(int a, int b) {
		// TODO Auto-generated method stub
		while (a > 0) {
			int r = b % a;
			b = a;
			a = r;
		}
		return b;
	}

}
