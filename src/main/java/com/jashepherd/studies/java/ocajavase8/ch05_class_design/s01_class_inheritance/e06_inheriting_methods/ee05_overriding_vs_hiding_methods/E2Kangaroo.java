package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee05_overriding_vs_hiding_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding vs. Hiding Methods - pages 254-255
 * <p>
 * This example uses method overriding where the parent instance method isBiped() is overridden by the child class isBiped()
 */
public class E2Kangaroo extends E2Marsupial {
	public boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "+isBiped());
	}
	public static void main(String[] args) {
		E2Kangaroo joey = new E2Kangaroo();
		joey.getMarsupialDescription();  // isBiped() from child used outputting true
		joey.getKangarooDescription();   // isBiped() from child used outputting true
	}
}
