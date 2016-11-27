package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e05_abstract_methods_multiple_inheritance;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Abstract Methods and Multiple Inheritance - pages 272-273
 * <p>
 * There is no implementation of E3Bear that can satisfy the mandates from the two interfaces it tries to implement.  These two
 * interfaces are essentially incompatible.
 */
public class E3Bear {}
/*
public class E3Bear implements E3Herbivore, E3Omnivore{
	public int eatPlants() {  // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
		return 10;
	}
	public void eatPlants() {  // DOES NOT COMPILE
		System.out.println("Eating plants");
	}
}
*/