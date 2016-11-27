package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s02_abstract_classes.e02_defining_abstract_class;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Defining an Abstract Class - pages 261-262
 */
public abstract class E6Whale {
//	private abstract void sing();  // DOES NOT COMPILE - abstract methods may not be marked private
	protected abstract void sing2();
}

class HumpbackWhale extends E6Whale {
	private void sing() {
		System.out.println("Humpback Whale is singing");
	}
//	private void sing2() {  // DOES NOT COMPILE - remember the rules of overriding, overridden methods cannot be less accessible
	public void sing2() {
		System.out.println("Humpback Whale is singing");
	}
}
