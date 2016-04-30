package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e08_stringbuilder_mutability_chaining;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * StringBuilder Mutability and Chaining - pages 112-113
 */
public class StringBuilderMutabilityChaining {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");                    // sb = "start+middle"
		StringBuilder same = sb.append("+end");  // sb and same = "start+middle+end"
		System.out.println("sb = " + sb);
		System.out.println("same = " + same);

		// only one StringBuilder object - a and b point to the same object
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
