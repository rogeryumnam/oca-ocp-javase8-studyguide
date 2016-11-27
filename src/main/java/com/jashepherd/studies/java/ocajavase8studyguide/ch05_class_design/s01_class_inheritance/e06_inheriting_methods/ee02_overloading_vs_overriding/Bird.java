package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee02_overloading_vs_overriding;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding a Method - Overloading vs. Overriding - pages 248-249
 * <p>
 * Overloading a method and overriding a method are similar in that they both involve
 * redefining a method using the same name. They differ in that an overloaded method will
 * use a different signature than an overridden method. This distinction allows overloaded
 * methods a great deal more freedom in syntax than an overridden method would have.
 */
public class Bird {
	public void fly() {
		System.out.println("Bird is flying");
	}
	public void eat(int food) {
		System.out.println("Bird is eating " + food + " units of food");
	}
}
