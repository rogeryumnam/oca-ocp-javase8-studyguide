package com.jashepherd.studies.java.ocajavase8studyguide.ch02_operators_statements.e02_unary_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Working with Unary Operators<br/>
 * Increment and Decrement Operators - pages 58-59
 */
public class A2IncrementDecrement {
	public static void main(String[] args) {
		int counter = 0;
		System.out.println(counter);    // Outputs 0
		System.out.println(++counter);  // Outputs 1
		System.out.println(counter);    // Outputs 1
		System.out.println(counter--);  // Outputs 1
		System.out.println(counter);    // Outputs 0

		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		// results in x is 2 and y is 7
	}
}
