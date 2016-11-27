package com.jashepherd.studies.java.ocajavase8.ch03_core_java_apis.e08_stringbuilder_mutability_chaining;

/**
 * Chapter 3: Core Java APIs<br>
 * Using the StringBuilder Class<br>
 * StringBuilder Mutability and Chaining - pages 112-114
 */
public class StringBuilderMutabilityChaining {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");                    // sb = "start+middle"
		StringBuilder same = sb.append("+end");  // sb and same = "start+middle+end"
		System.out.println("sb = " + sb);        // "sb = start+middle+end"
		System.out.println("same = " + same);    // "same = start+middle+end"

		// only one StringBuilder object - a and b point to the same object
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);  // "a=abcdefg" - a and b point to same StringBuilder object
		System.out.println("b=" + b);  // "b=abcdefg" - a and b point to same StringBuilder object
	}
}
