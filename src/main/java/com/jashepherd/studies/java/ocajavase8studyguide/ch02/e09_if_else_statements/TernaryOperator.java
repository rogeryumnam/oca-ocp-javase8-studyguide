package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e09_if_else_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * Ternary Operator - pages 71-72
 * <p>
 * The ternary operation is really a condensed form of an if-then-else statement that returns a value.
 */
public class TernaryOperator {
	public static void main(String[] args) {

		int y = 10;
		final int x;
		if(y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}

		// as a ternary operation
		int y1 = 10;
		int x1 = y1 > 5 ? 2 * y1 : 3 * y1;

		// adding parenthesis for readability
		int x2 = (y1 > 5) ? (2 * y1) : (3 * y1);

		System.out.println((y > 5) ? 21 : "Zebra");
		// int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE - because of data type

		/* As of Java 7, only one of the right-hand expressions of the ternary operator will be evaluated at
		runtime. In a manner similar to the short-circuit operators, if one of the two righthand
		expressions in a ternary operator performs a side effect, then it may not be applied runtime.
		 */
		int y3 = 1;
		int z3 = 1;
		final int x3 = y3<10 ? y3++ : z3++;
		System.out.println(y3+","+z3); // Outputs 2,1

		int y4 = 1;
		int z4 = 1;
		final int x4 = y4>=10 ? y4++ : z4++;
		System.out.println(y4+","+z4); // Outputs 1,2
	}
}
