package com.jashepherd.studies.java.ocajavase8.ch02_operators_statements.e06_logical_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Logical Operators - pages 64-65
 * <ul>
 * <li><code>&</code> AND is only true if both operands are true.</li>
 * <li><code>|</code> Inclusive OR is only false if both operands are false.</li>
 * <li><code>^</code> Exclusive OR is only true if the operands are different.</li>
 * </ul>
 */
public class LogicalOperators {
	public static void main(String[] args) {
		boolean x = false;
		x = true | true;  // true
		x = true || true;  // true
		x = true | false; // true
		x = true || false;  // true
		x = false | true;  // true
		x = false || true; // true
		x = false | false;  // false
		x = false || false;  // false

		x = true & true;  // true
		x = true && true;  // true
		x = true & false;  // false
		x = true && false;  // false
		x = false & true;  // false
		x = false && true;  // false
		x = false & false;  // false
		x = false && false;  // false

		x = true ^ true; // false
		x = true ^ false;  // true
		x = false ^ true; // true
		x = false ^ false; // false

		x = true || (5 < 4);  // true = right side never evaluated hence "short-circuit"

		// useful for null checks - prevents null pointer exception with short-circuit operator
		LogicalOperators lo = new LogicalOperators();
		if ( lo != null && lo.getValue() < 5) {
			// do something
		}

		// bad example
		if ( lo != null & lo.getValue() < 5) {  // throws an exception if lo is null
			// do something
		}

		int x1 = 6;
		boolean y = (x1 >= 6) || (++x1 <= 7);
		System.out.println(x1);
		/* Because x1 >= 6 is true, the increment operator on the right-hand side of the expression
		is never evaluated, so the output is 6. */
	}

	private int getValue() {
		return 4;
	}
}
