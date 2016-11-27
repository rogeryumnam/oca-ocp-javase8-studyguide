package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e05_abstract_methods_multiple_inheritance;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Abstract Methods and Multiple Inheritance - pages 271-272
 * <p>
 * This class must implement two versions of eatPlants since the interface signatures do not match
 */
public class E2Bear implements E2Herbivore, E2Omnivore {
	public int eatPlants(int quantity) {  // implementation mandated by interface E2Herbivore
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}
	public void eatPlants() {  // implementation mandated by interface E2Omnivore
		System.out.println("Eating plants");
	}
}
