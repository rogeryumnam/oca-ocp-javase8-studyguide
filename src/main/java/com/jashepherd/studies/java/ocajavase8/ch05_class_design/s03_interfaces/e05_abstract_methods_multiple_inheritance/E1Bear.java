package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e05_abstract_methods_multiple_inheritance;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Abstract Methods and Multiple Inheritance - page 271
 */
public class E1Bear implements E1Herbivore, E1Omnivore {
	public void eatMeat() {
		System.out.println("Eating meat");
	}
	public void eatPlants() {  // satisfies the implementation requirement for eatPlant() mandated by both interfaces
		System.out.println("Eating plants");
	}
}
