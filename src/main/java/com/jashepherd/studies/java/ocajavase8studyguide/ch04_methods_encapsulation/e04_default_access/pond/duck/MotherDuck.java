package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e04_default_access.pond.duck;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Default (Private Package) Access - page 175
 */
public class MotherDuck {
	String noise = "quack";
	void quack() {
		System.out.println(noise);  // default access is ok
	}
	private void makeNoise() {
		quack();  // default access is ok
	}
}
