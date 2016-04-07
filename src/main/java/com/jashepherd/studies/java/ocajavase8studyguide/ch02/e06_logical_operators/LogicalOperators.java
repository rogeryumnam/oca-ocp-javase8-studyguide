package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e06_logical_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Logical Operators - page 63
 * <ul>
 * <li>AND is only true if both operands are true.</li>
 * <li>Inclusive OR is only false if both operands are false.</li>
 * <li>Exclusive OR is only true if the operands are different.</li>
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

		x = true || (5 < 4);  // true = right side never evaluated

		// useful for null checks - prevents null pointer exception with short-circuit operator
		LogicalOperators lo = new LogicalOperators();
		if ( lo != null && lo.getValue() < 5) {
			// do something
		}

		// bad example
		if ( lo != null & lo.getValue() < 5) {  // throws an exception if x is null
			// do something
		}

		int x1 = 6;
		boolean y = (x1 >= 6) || (++x1 <= 7);
		System.out.println(x1);
		/* Because x >= 6 is true, the increment operator on the right-hand side of the expression
		is never evaluated, so the output is 6. */
	}

	private int getValue() {
		return 4;
	}
}
