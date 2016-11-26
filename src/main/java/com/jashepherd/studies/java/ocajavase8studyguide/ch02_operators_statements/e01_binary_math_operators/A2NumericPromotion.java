package com.jashepherd.studies.java.ocajavase8studyguide.ch02_operators_statements.e01_binary_math_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Working with Binary Arithmetic Operators<br/>
 * Numeric Promotion - pages 55-56
 * <p>
 * Numeric Promotion Rules:
 * <ol>
 * <li>If two values have different data types, Java will automatically promote one of the values
 * to the larger of the two data types.</li>
 * <li>If one of the values is integral and the other is floating-point, Java will automatically
 * promote the integral value to the floating-point value's data type.
 * <li>Smaller data types, namely byte, short, and char, are first promoted to int any time
 * they're used with a Java binary arithmetic operator, even if neither of the operands is int.</li>
 * <li>After all promotion has occurred and the operands have the same data type, the resulting
 * value will have the same data type as its promoted operands.</li>
 * </ol>
 * <i>For the third rule, note that unary operators are excluded from this rule</i>
 */
public class A2NumericPromotion {
	public static void main(String args[]) {
		int x = 1;
		long y = 33;
		// x * y results in a long data type
		long z = x * y;

		double x1 = 39.21;
		// float y1 = 2.1;  // WILL NOT COMPILE - not without the 'f' at the end of the literal 2.1f
		float y1 = 2.1f;
		// x1 + y1 results in a double data type
		double z1 = x1 + y1;

		short x2 = 10;
		short y2 = 3;
		// x2 / y2 results in an int data type
		int z2 = x2 / y2;

		short x3 = 14;
		float y3 = 13;
		double z3 = 30;
		// x3 * y3 / z3 results in a double data type
		double zz = x3 * y3 / z3;
	}
}
