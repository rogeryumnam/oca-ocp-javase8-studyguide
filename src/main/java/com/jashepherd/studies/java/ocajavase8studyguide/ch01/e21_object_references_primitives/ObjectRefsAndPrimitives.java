package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e21_object_references_primitives;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Distinguishing Between Object References and Primitives<br/>
 * Primitives and Object References - pages 20-24
 * <p>
 */
public class ObjectRefsAndPrimitives {

	// Java has eight built in primitive data types
	boolean bool = true;
	byte b = 123;        // 8-bit integral value
	short s = 123;       // 16-bit integral value
	int i = 123;         // 32-bit integral value
	long l = 123;        // 64-bit integral value
	float f = 123.45f;   // 32-bit floating-point value
	double d = 123.45;   // 64-bit floating-point value
	char c = 'a';        // 16-bit Unicode value

	// long max = 3123456789;  // DOES NOT COMPILE - value too large
	long max = 3123456789L;  // now Java knows it is a long

	int decimal = 56;        // 56
	int binary = 0b11;       // 3
	int octal = 017;         // 15
	int hexadecimal = 0x1F;  // 31

	// underscores are allowed to make numbers easier to read
	int million1 = 1000000;
	int million2 = 1_000_000;

	/* bad examples
	double = notAtStart = _1000.00;  // DOES NOT COMPILE
	double notAtEnd = 1000.00_;      // DOES NOT COMPILE
	double notByDecimal = 1000_.00   // DOES NOT COMPILE
	 */
	double annoyingButLegal = 1_00_0.0_0;  // this one compiles


	public static void main(String[] args) {
		// declare reference type
		java.util.Date today;
		String greeting;

		// assign the references to new objects
		today = new java.util.Date();
		greeting = "How are you?";

		// null value can only be assigned to object references
		String s = null;
		// int value = null;  // DOES NOT COMPILE

		// methods can be called on object references that are not null
		String reference = "hello";
		int len = reference.length();
		// int bad = len.length(); // DOES NOT COMPILE
	}
}
