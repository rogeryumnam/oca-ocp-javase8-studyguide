package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 177
 */
public class Bird {
	protected String text = "floating";  // protected access
	protected void floatInWater() {  // protected access
		System.out.println(text);
	}
}
