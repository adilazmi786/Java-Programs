package adil.lambda.expression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		int comparision = comp.compare("hello", "world");
		System.out.println(comparision);

		// lambda 
		Comparator<String> stringLambda = (o1, o2) -> {
			return o1.compareTo(o2);
		};
		
		Comparator<Integer> intLambda = (o1, o2) -> {
			return o1-o2;
		};
		int compareStringLambda=stringLambda.compare("hello", "world");
		int compareIntLambda=intLambda.compare(2,4);

		System.out.println(compareStringLambda);
		System.out.println(compareIntLambda);
		// java lambda expression can implement interface with a 
		// single unimplemented method (abstract method)
		
		LambdaInterface anagram=(o1,o2)->{
			return checkAnagram(o1,o2);
		};
		boolean isAnagram=anagram.anagram("Hallo", "India");
	
		LambdaInterface.show("This is static method");
		anagram.name("This is default method");
		System.out.println(isAnagram);
	}

	private static boolean checkAnagram(String o1, String o2) {
		// TODO Auto-generated method stub
		o1=sortString(o1.toLowerCase());
		o2=sortString(o2.toLowerCase());
		System.out.println(o1+" "+o2);
		
		return false;
	}

	public static String sortString(String o1) {
		return Stream.of(o1.split("")).sorted().collect(Collectors.joining());
	}

}
