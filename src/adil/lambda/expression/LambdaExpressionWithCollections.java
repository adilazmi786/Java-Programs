package adil.lambda.expression;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=========List==========");
		List<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
		list.forEach(x->{
			System.out.println(x%2==0?x:0);
		});
		
	
		
	}

}
