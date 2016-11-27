package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e05_protected_access.pond.shore;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 177
 * <p>
 * A Bird class with protected access to its members
 */
public class Bird {
	protected String text = "floating";  // protected access
	protected void floatInWater() {  // protected access
		System.out.println(text);
	}
}
