package com.jashepherd.studies.java.ocajavase8.ch02_operators_statements.e11_while_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The do-while Statement - pages 78-80
 * <p>
 * The do-while loop guarantees that the statement block will be executed at least once
 */
public class A2DoWhileStatements {
	static public void main(String... someArgs) {
		int x = 0;
		do {
			x++;
		} while (false);
		System.out.println(x);  // outputs 1

		// as a regular while
		while (x > 10) {
			x--;
		}

		// re-written as a do-while loop
		if (x > 10) {
			do {
				x--;
			} while (x > 10);
		}

		// leveraging the existing if-then statement
		if (x > 10) {
			do {
				x--;
			} while (x > 10);
		} else {
			x++;
		}
	}
}
