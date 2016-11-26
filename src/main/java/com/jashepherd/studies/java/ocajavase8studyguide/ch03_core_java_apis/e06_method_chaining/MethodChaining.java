package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e06_method_chaining;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * Method Chaining - pages 110-111
 */
public class MethodChaining {
	public static void main(String... args) {

		// Not Chained
		String start = "AniMaL   ";
		String trimmed = start.trim();                // "AniMaL"
		String lowercase = trimmed.toLowerCase();     // "animal
		String result = lowercase.replace("a", "A");  // "Animal"
		System.out.println(result);

		// Using the chaining method
		String result2 = "AniMal   ".trim().toLowerCase().replace("a", "A");
		System.out.println(result2);

		// What is the result of this code?
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		// a=abc
		// b=A23
	}
}
