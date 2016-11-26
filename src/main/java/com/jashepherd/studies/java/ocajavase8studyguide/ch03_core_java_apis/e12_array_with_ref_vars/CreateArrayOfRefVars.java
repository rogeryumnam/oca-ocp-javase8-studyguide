package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e12_array_with_ref_vars;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Java Arrays<br>
 * Creating an Array with Reference Variables - pages 121-123
 */
public class CreateArrayOfRefVars {
	public static void main(String[] args) {
		String [] bugs = {"cricket", "beetle", "ladybug"};
		String [] alias = bugs;
		System.out.println(bugs.equals(alias));  // true
		System.out.println(bugs.toString());  // [Ljava.lang.String;@1b6d3586

		// useful method since Java 5 for printing arrays
		System.out.println(java.util.Arrays.toString(bugs));

		// What does this array point to?  Answer - null
		String names[];

		// What does this array point to?
		String names2[] = new String[2];
		// it is a sting array called names2 with a size of 2 with each value being the default for the type, null in this case

		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		// againStrings[0] = new StringBuilder();  // DOES NOT COMPILE - StringBuilder is not a String
		objects[0] = new StringBuilder();  // careful!
		/* The previous line is not actually an object array.  It is a String array referred to from an Object array variable.
		 * At runtime this code would throw an ArrayStoreException.
		 */
	}
}
