package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e12_for_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The Basic for Statement - pages 80-83
 */
public class A1BasicFor {
	public static void main(String... args) {
		// prints the numbers 0 - 9
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// infinite loop - compiles on its own, but causes unreachable code compile error for subsequent statements
		/*
		for ( ; ; ) {
			System.out.println("Hello World");
		}
		*/

		// adding multiple terms to the for statement
		int x = 0;
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(System.lineSeparator() + x);

		// redeclaring a variable in the initialization block
		/*
		int x1 = 0;
		for(long y1 = 0, x1 = 4; x1 < 5 && y1 < 10; x1++, y1++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}
		*/

		// above fixed
		int x1 = 0;
		long y1 = 10;
		for(y1 = 0, x1 = 4; x1 < 5 && y1 < 10; x1++, y1++) {
			System.out.print(x1 + " ");
		}

		// trying to use incompatible data types in the initialization block
		/*
		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE - vars in initialization block must be of same data type
			System.out.print(x + " ");
		}
		*/

		// trying to use loop variables outside of the loop
		/*
		for(long y2 = 0, x2 = 4; x2 < 5 && y2 < 10; x2++, y2++) {
			System.out.print(y2 + " ");
		}
		System.out.print(x2); // DOES NOT COMPILE
		*/
	}
}
