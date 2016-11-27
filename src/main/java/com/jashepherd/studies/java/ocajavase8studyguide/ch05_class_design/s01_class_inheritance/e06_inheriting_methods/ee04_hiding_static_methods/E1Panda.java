package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee04_hiding_static_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Hiding Static Methods - pages 252-253
 */
public class E1Panda extends E1Bear {
	public static void eat() {
		System.out.println("Panda bear is chewing");
	}
	public static void main(String[] args) {
		E1Panda.eat();
	}
}
