package com.jashepherd.studies.java.ocajavase8.ch02_operators_statements.e07_equality_operators;

import java.io.File;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Equality Operators - pages 65-66
 * <p>
 * The equality operators are used in one of three scenarios:
 * <ol>
 * <li>Comparing two numeric primitive types. If the numeric values are of different data
 * types, the values are automatically promoted as previously described. For example,
 * 5 == 5.00 returns true since the left side is promoted to a double.</li>
 * <li>Comparing two boolean values.</li>
 * <li>Comparing two objects, including null and String values.</li>
 * </ol>
 */
public class EqualityOperators {
	public static void main(String... args) {
		/* bad examples - cannot mix and match data types
		boolean x = true == 3;  // DOES NOT COMPILE
		boolean y = false != "Giraffe";  // DOES NOT COMPILE
		boolean z = 3 == "Kangaroo";  // DOES NOT COMPILE
		*/

		boolean y1 = false;
		boolean x = (y1 = true);
		System.out.println(x);  // outputs true

		File x2 = new File("myFile.txt");
		File y2 = new File("myFile.txt");
		File z2 = x2;
		System.out.println(x2 == y2);  // outputs false
		System.out.println(x2 == z2);  // outputs true

		Object x3 = null;
		Object y3 = null;
		System.out.println(x3 == y3);  // outputs true
	}
}
