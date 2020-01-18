package adil.lambda.expression;

public interface LambdaInterface {

    default void name(String text) {
		System.out.println(text);
	}
	
	static void show(String text) {
		System.out.println(text);
	}
	public boolean anagram(String s1,String s2);
	//public int add(int a,int b);
	
}
