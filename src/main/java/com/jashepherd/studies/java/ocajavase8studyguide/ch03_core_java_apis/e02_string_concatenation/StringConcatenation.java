package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e02_string_concatenation;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * Concatenation - page 102-104
 */
public class StringConcatenation {
	static public void main(String... args) {
		System.out.println(1 + 2);         // 3
		System.out.println("a" + "b");     // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c");   // 3c

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);  // 64

		String s = "1";        // s currently holds "1"
		s += "2";              // s currently holds "12"
		s += 3;                // s currently holds "123"
		System.out.println(s); // 123

		System.out.println();

		// concat() - rarely used but can but used instead of +
		System.out.println(four.concat(" and more"));
		System.out.println(four + " and more");
	}
}
