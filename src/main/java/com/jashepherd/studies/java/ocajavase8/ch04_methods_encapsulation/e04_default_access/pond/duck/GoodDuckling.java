package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e04_default_access.pond.duck;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Default (Private Package) Access - page 175
 */
public class GoodDuckling {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack();  // default access - same package so all is good
		System.out.println(duck.noise);  // default access - same package so all is good
	}
}
