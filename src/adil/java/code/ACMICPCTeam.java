package adil.java.code;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// String[] nm = scanner.nextLine().split(" ");
		System.out.println(LocalDateTime.now());
		String[] topic = new String[4];

		for (int i = 0; i < 4; i++) {
			String topicItem = scanner.nextLine();
			topic[i] = topicItem;
		}
		int[] result = acmTeam(topic);
		Arrays.stream(result).forEach(e -> System.out.print(e + " "));
	}

	static int[] acmTeam(String[] topic) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		int res[] = new int[2];
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int i = 0; i < topic.length; i++) {
			for (int j = i + 1; j < topic.length; j++) {
				count = compareCharacter(topic[i].toCharArray(), topic[j].toCharArray(), 0);
				if (count >= max) {
					max = count;
					if (hmap.containsKey(max))
						hmap.put(max, hmap.get(max) + 1);
					else {
						hmap.put(max, 1);
					}
				}
			}
		}
		Map.Entry<Integer, Integer> maxEntry = hmap.entrySet().stream().max(Map.Entry.comparingByKey()).get();
		System.out.println(maxEntry.getKey());
		res[0] = maxEntry.getKey();
		res[1] = maxEntry.getValue();
		return res;

	}

	private static int compareCharacter(char[] topic1, char[] topic2, int count) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topic1.length && i < topic2.length; i++)
			if ((topic1[i] == '1' && topic2[i] == '1') || (topic1[i] == '0' && topic2[i] == '1')
					|| (topic1[i] == '1' && topic2[i] == '0')) {
				count++;
			}
		return count;
	}

}
