package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e03_string_immutability;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * Immutability - pages 104-105
 */
public class StringImmutability {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);  // outputs 12
	}
}
