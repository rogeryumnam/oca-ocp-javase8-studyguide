package com.jashepherd.studies.java.ocajavase8.ch03_core_java_apis.e10_understanding_equality;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Equality<br>
 * pages 117-119
 */
public class UnderstandingEquality {
	public static void main(String... args) {

		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two);         // false
		System.out.println(one == three);       // true
		System.out.println(one.equals(two));    // false - StringBuilder does not implement equals method
		System.out.println(one.equals(three));  // true - StringBuilder does not implement equals method

		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); // true

		String x1 = "Hello World";
		String z1 = " Hello World".trim();
		System.out.println(x1 == z1); // false

		String x2 = new String("Hello World");
		String y2 = "Hello World";
		System.out.println(x2 == y2); // false

		String x3 = "Hello World";
		String z3 = " Hello World".trim();
		System.out.println(x3.equals(z3)); // true

		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = t1;
		System.out.println(t1 == t1);       // true
		System.out.println(t1 == t2);       // false
		System.out.println(t1 == t3);       // true
		System.out.println(t1.equals(t2));  // false - because Tiger does not implement equals()
		System.out.println(t1.equals(t3));  // true
	}
}

class Tiger {
	String name;
}
