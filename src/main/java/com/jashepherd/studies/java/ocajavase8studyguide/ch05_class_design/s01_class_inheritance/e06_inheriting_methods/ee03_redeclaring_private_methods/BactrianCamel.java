package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee03_redeclaring_private_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Redeclaring private Methods - pages 251-252
 */
public class BactrianCamel extends Camel {

	/* This is not an override of parent getNumberOfHumps() since parent accessibility is private.  This merely redeclares a method
	 * with the same name free of override rule requirements. */
	private int getNumberOfHumps() {
		return 2;
	}
}
