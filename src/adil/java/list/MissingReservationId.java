package adil.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.ListUI;

public class MissingReservationId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> firstReservationList = new ArrayList<List<Integer>>();
		List<Integer> a = new ArrayList<>(Arrays.asList(1234, 532632));
		List<Integer> b = new ArrayList<>(Arrays.asList(2354, 732634));

		firstReservationList.add(a);
		firstReservationList.add(b);

		List<List<Integer>> secondReservationList = new ArrayList<List<Integer>>();
		List<Integer> a1 = new ArrayList<>(Arrays.asList(1234, 532632));
		List<Integer> b1 = new ArrayList<>(Arrays.asList(234, 632633));
		List<Integer> c1 = new ArrayList<>(Arrays.asList(458, 642633));
		List<Integer> d1 = new ArrayList<>(Arrays.asList(2354, 732634));

		secondReservationList.add(a1);
		secondReservationList.add(b1);
		secondReservationList.add(c1);
		secondReservationList.add(d1);

		List<Integer> res = missingReservations(firstReservationList, secondReservationList);
		System.out.println(res);

	}

	public static List<Integer> missingReservations(List<List<Integer>> firstReservationList,
			List<List<Integer>> secondReservationList) {
		// Write your code here
		// List<Integer> res = new ArrayList<>();
		List<Integer> alist = new ArrayList<>();
		List<Integer> flist = new ArrayList<>();

		for (List<Integer> s : secondReservationList) {
			alist.add(s.get(0));
		}
		for (List<Integer> f : firstReservationList) {
			flist.add(f.get(0));

		}
		return alist.stream().filter(x -> !flist.contains(x)).collect(Collectors.toList());
	}

}
