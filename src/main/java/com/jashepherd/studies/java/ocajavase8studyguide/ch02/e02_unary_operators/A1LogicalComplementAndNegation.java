package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e02_unary_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Working with Unary Operators<br/>
 * Logical Complement and Negation Operators - pages 57-58
 */
public class A1LogicalComplementAndNegation {
	public static void main(String[] arguments) {
		// logical complement practice
		boolean x = false;
		System.out.println(x);  // false
		x = !x;
		System.out.println(x);  // true

		// negation practice
		double x1 = 1.21;
		System.out.println(x1);  // 1.21
		x1 = -x1;
		System.out.println(x1);  // -1.21
		x1 = -x1;
		System.out.println(x1);  // 1.21

		/* bad examples
		int x2 = !5;  // DOES NOT COMPILE
		boolean y = -true;  // DOES NOT COMPILE
		boolean z = !0;  // DOES NOT COMPILE
		 */
	}
}
