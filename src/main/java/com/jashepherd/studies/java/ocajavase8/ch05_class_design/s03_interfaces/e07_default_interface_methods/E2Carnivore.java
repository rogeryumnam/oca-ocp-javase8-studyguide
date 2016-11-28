package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e07_default_interface_methods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - page 276
 * <p>
 * Bad examples
 */
public interface E2Carnivore {
	/*
	public default void eatMeat();  // DOES NOT COMPILE - default interface methods must have a body
	public int getRequiredFoodAmount() {  // DOES NOT COMPILE - if there is a body to an interface method it must be marked default
		return 13;
	}
	public static default void eatMeat2() {  // DOES NOT COMPILE - interface default methods may not be marked static
		System.out.println("Eating meat");
	}
	public final default void eatMeat3() {  // DOES NOT COMPILE - interface default methods may not be marked final
		System.out.println("Eating meat");
	}
	public abstract default void eatMeat3() {  // DOES NOT COMPILE - interface default methods may not be marked abstract
		System.out.println("Eating meat");
	}
	*/
}
