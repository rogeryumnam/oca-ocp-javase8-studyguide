package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e07_stringbuilder;

/**
 * Chapter 3: Core Java APIs<br>
 * Using the StringBuilder Class<br>
 * pages 111-112 & 113
 */
public class StringBuilderClass {
	static public void main(String... args) {

		// 3 ways to create
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);  // tell the JVM how big the capacity is

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
