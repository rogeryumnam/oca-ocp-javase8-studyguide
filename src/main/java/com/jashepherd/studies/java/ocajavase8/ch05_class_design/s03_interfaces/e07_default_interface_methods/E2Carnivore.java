package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e07_default_interface_methods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - page 275
 * <p>
 * Bad examples
 */
public interface E2Carnivore {
	/*
	public default void eatMeat();  // DOES NOT COMPILE - default interface methods must have a body
	public int getRequiredFoodAmount() {  // DOES NOT COMPILE - if there is a body to an interface method it must be marked default
		return 13;
	}
	*/
}
