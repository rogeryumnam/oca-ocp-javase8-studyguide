package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e04_string_pool;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * The String Pool - page 105
 */
public class StringBasics {
	// these two statements both create a String object
	String name = "Fluffy";  // uses string pool
	String name1 = new String("Fluffy");  // does not use the string pool - less efficient - not advised
}
