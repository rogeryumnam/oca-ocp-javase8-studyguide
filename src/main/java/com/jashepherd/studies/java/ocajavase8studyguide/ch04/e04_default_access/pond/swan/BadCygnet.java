package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e04_default_access.pond.swan;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e04_default_access.pond.duck.MotherDuck;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Default (Private Package) Access - page 176
 */
public class BadCygnet {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
//		duck.quack();  // DOES NOT COMPILE - tries to use default access member
//		System.out.println(duck.noise);  // DOES NOT COMPILE - tries to use default access member
	}
}
