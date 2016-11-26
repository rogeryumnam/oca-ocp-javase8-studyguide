package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.e03_defining_constructors;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Defining Constructors - pages 238-240
 */
public class E2Zoo {
	public E2Zoo() {
		System.out.println("Zoo created");
//		super();  // DOES NOT COMPILE - super() must be first statement in constructor
	}

	public E2Zoo(int x) {
		super();
		System.out.println("Zoo created");
//		super();  // DOES NOT COMPILE - super() can only be the first statement
	}
}
