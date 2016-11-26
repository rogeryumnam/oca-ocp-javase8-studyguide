package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e13_overloading_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Methods<br>
 * Reference Types - pages 193-194
 */
public class E4ReferenceTypes {

	public void fly(String s) {
		System.out.println("string ");
	}
	public void fly(Object o) {
		System.out.println("object ");
	}

	public static void main(String[] args) {
		E4ReferenceTypes r = new E4ReferenceTypes();
		r.fly("test");  // calls the String version - exact match

		// calls the object version - looks for a int, doesn't find one so autoboxes to Integer, doesn't find one so goes to object version
		r.fly(56);
	}
}
