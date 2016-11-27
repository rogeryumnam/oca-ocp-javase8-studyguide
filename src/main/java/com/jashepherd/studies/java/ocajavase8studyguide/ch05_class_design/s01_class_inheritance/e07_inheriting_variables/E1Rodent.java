package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e07_inheriting_variables;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Variables - Hiding Variables - pages 257-258
 */
public class E1Rodent {
	protected  int tailLength = 4;
	public void getRodentTails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}
