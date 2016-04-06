package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e05_relational_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Relational Operators - page 63
 * <p>
 * Relational operators compare two expressions and return a boolean value. The first
 * four relational operators are applied to numeric primitive data types only. If the
 * two numeric operands are not of the same data type, the smaller one is promoted.
 */
public class RelationalOperators {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 10;
		System.out.println(x < y);  // outputs true
		System.out.println(x <= y);  // outputs true
		System.out.println(x >= z);  // outputs true
		System.out.println(x > z);  // outputs false

		RelationalOperators a = new RelationalOperators();
		System.out.println(a instanceof Object);  // outputs true
	}
}
