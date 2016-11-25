package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e03_private_access.pond.duck;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Private Access - page 174
 */
public class BadDuckling {
	public void makeNoise() {
		FatherDuck duck = new FatherDuck();
//		duck.quack();  // DOES NOT COMPILE - tries to access private member
//		System.out.println(duck.noise);  // DOES NOT COMPILE - tries to access private member
	}
}
