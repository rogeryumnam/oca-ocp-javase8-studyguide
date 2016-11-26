package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.e03_defining_constructors;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Defining Constructors - pages 238-240
 * <p>
 * this() and super() if used, must be the first statement in a constructor
 */
public class E1Animal {
	private int age;
	public E1Animal(int age) {
		super();  // call to the parent constructor defined in java.lang.Object
		this.age = age;
	}
}
