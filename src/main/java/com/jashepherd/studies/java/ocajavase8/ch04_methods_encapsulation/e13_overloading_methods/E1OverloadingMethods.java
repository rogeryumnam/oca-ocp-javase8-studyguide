package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e13_overloading_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Methods<br>
 * pages 191-192
 */
public class E1OverloadingMethods {

	// all valid overloaded methods
	public void fly(int numMiles) {};
	public void fly(short numFeet) {};
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) {}
	public void fly(short numFeet, int numMiles) throws Exception {}

	// bad examples
	public void fly1(long numMiles) {}
//	public int fly1(long numMiles) {}  // DOES NOT COMPILE - because it only differs by return type

	public void fly2(int numMiles) {}
//	public static void fly(int numMiles) {}  // DOES NOT COMPILE - becuase it only differs by static vs instance

	// calling overloaded methods
	public void fly3(int numMiles) {
		System.out.println("intMiles");
	}
	public void fly3(short numFeet) {
		System.out.println("shortFeet");
	}

	public static void main(String[] args) {
		E1OverloadingMethods om = new E1OverloadingMethods();
		om.fly3((short) 3);  // calls the shortFeet version
		om.fly3(3);          // calls the intMiles version
	}
}
