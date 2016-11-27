package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e13_overloading_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Methods<br>
 * Autoboxing - page 193
 */
public class E3Autoboxing {

	public void fly(Integer numMiles) {}

	public static void main(String[] args) {
		E3Autoboxing ab = new E3Autoboxing();
		ab.fly(3);  // calls the fly method and the 3 is autoboxed to an Integer

		ab.fly1(3);  // calls the int numMiles version and not the Integer numMiles version
	}

	// what if we have both a primitive parameter and a wrapper class parameter?
	public void fly1(int numMiles) {}
	public void fly1(Integer numMiles) {}  //  not used - Java will only use the autobox version if there is no matching primitive version
}
