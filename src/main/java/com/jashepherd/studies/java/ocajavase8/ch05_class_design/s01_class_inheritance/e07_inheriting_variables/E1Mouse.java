package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e07_inheriting_variables;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Variables - Hiding Variables - pages 257-258
 */
public class E1Mouse extends E1Rodent {
	protected int tailLength = 8;  // hides the parent tailLength variable
	public void getMouseDetails() {
		System.out.println("[tail=" + tailLength + ", parentTail=" + super.tailLength + "]");  // refers to child and parent tailLength
	}
	public static void main(String[] args) {
		E1Mouse mouse = new E1Mouse();
		mouse.getRodentTails();
		mouse.getMouseDetails();
	}
}
