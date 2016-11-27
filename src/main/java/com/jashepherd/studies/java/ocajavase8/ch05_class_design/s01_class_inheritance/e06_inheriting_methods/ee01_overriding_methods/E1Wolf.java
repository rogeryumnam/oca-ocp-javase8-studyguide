package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee01_overriding_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding a Method - pages 246-248
 */
public class E1Wolf extends E1Canine {
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
//		return getAverageWeight() + 20;  // INFINITE LOOP - recursively call itself until stack overflow error at runtime
	}

	public static void main(String[] args) {
		System.out.println(new E1Canine().getAverageWeight());
		System.out.println(new E1Wolf().getAverageWeight());
	}
}
