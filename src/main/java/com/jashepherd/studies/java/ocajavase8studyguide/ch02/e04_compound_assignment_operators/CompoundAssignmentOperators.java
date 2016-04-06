package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e04_compound_assignment_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Compound AssignmentOperators - page 62
 * <p>
 */
public class CompoundAssignmentOperators {
	public static void main(String[] args) {
		int x = 2, z = 3;
		x = x + z;  // simple assignment operator
		x += z;  // compound assignment operator
		System.out.println(x);  // outputs 8

		x = 2; z = 3;
		x = x - z;  // simple assignment operator
		x -= z;  // compound assignment operator
		System.out.println(x);  // outputs -4

		x = 2; z = 3;
		x = x * z;  // simple assignment operator
		x *= z;  // compound assignment operator
		System.out.println(x);  // outputs 18

		x = 18; z = 3;
		x = x / z;  // simple assignment operator
		x /= z;  // compound assignment operator
		System.out.println(x);  // outputs 2

		long x1 = 10;
		int y1 = 5;
		// y1 = y1 * x1;  // DOES NOT COMPILE - long won't implicitly fit into an int var
		y1 = (int)(y1 * x1);  // works but there's another way
		y1 *= x1;  // compound operators automatically downcast

		long x2 = 5;
		long y2 = (x2=3);
		System.out.println(x2);  // outputs 3
		System.out.println(y2);  // also outputs 3
	}
}
