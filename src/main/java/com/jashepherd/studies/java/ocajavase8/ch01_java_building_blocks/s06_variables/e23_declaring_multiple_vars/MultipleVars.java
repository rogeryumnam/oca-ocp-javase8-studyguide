package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s06_variables.e23_declaring_multiple_vars;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Declaring and Initializing Variables<br/>
 * Declaring Multiple Variables - pages 26
 */
public class MultipleVars {
	// declare multiple variables in single line if they are the same type
	String s1, s2;
	String s3 = "yes", s4 = "no";

	// only i3 is explicitly initialized although i1 and i2 are also zero because that is the default
	// value for int vars
	int i1, i2, i3 = 0;

	// valid examples
	boolean b1, b2;
	String s5 = "1", s6;
	int i4; int i5;

	/* invalid examples
	 int num, String value;  // DOES NOT COMPILE - not same type
	 int i6; i7;  // DOES NOT COMPILE - no type specified for i7
	 */

	public static void main(String[] args) {
		MultipleVars mv = new MultipleVars();
		System.out.println(mv.i1);
		System.out.println(mv.i2);
		System.out.println(mv.i3);
	}
}
