package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e23_lambda_experiments;

interface Test1 {
	boolean test();
}

interface Test2 {
	boolean test(String a);
}

interface Test3 {
	boolean test(String a, String b);
}


public class LambdaExperiment2 {

	static String a = "test A String";
	static String b = "B String";

	public static void main(String[] args) {

		print(() -> true);                                    // 0 parameters
		print(a -> a.startsWith("test"));                     // 1 parameter
		print((String a) -> a.startsWith("test"));            // 1 parameter
		print((a, b) -> a.startsWith("test"));                // 2 parameters
		print((String a, String b) -> a.startsWith("test"));  // 2 parameters

	}

	private static void print(Test1 t) {
		if (t.test())
			System.out.println("Yo Buddy!");
	}

	private static void print(Test2 t) {
		if (t.test(LambdaExperiment2.a))
			System.out.println("Starts with test");
		else
			System.out.println("Does not start with test");
	}

	private static void print(Test3 t) {
		if (t.test(LambdaExperiment2.a, LambdaExperiment2.b))
			System.out.println("a starts with test");
		else
			System.out.println("a does not start with test");
	}
}
