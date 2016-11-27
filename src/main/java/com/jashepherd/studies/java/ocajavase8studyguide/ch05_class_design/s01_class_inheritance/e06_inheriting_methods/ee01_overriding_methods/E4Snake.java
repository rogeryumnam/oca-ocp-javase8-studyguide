package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee01_overriding_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding a Method - pages 250-251
 */
public class E4Snake extends E4Reptile{
	/*
	protected double getHeight() throws Exception {  // DOES NOT COMPILE - child throws exception which is broader than parent
		return 2;
	}
	protected int getLength() throws E3InsufficientDataException {  // DOES NOT COMPILE - child throws new exception
		return 10;
	}
	*/
}
