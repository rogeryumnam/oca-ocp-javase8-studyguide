package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee05_overriding_vs_hiding_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding vs. Hiding Methods - pages 254-255
 * <p>
 * This example uses method overriding where the parent instance method isBiped() is overridden by the child class isBiped()
 */
public class E2Marsupial {
	public boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
	}
}
