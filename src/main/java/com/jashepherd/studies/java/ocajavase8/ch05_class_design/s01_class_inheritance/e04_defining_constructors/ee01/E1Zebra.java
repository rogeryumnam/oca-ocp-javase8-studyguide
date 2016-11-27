package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e04_defining_constructors.ee01;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Defining Constructors - pages 238-240
 * <p>
 * this() and super() if used, must be the first statement in a constructor
 */
public class E1Zebra extends E1Animal {
	public E1Zebra(int age) {
		super(age);
	}
	public E1Zebra() {
		this(4);
	}
}
