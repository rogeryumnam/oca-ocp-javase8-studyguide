package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e07_stringbuilder;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * Using the StringBuilder Class - pages 111-112
 */
public class StringBuilderClass {
	static public void main(String... args) {

		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++)
			alpha += current;
		System.out.println(alpha);

		StringBuilder beta = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			beta.append(current);
		System.out.println(beta);
	}
}
