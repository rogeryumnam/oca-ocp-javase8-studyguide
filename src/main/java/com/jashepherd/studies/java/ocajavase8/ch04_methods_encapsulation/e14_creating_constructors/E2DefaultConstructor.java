package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e14_creating_constructors;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Creating Constructors<br>
 * Default Constructor - pages 197-199
 */
public class E2DefaultConstructor {
}

class Rabbit {
	// default constructor
	public Rabbit() {}

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
	}
}

class Rabbit1 {}  // only Rabbitx class that has a default constructor
class Rabbit2 {
	public Rabbit2() { }
}
class Rabbit3 {
	public Rabbit3(boolean b) { }
}
class Rabbit4 {
	private Rabbit4() { }
}

// lets call those Rabbitx constructors
class RabbitsMultiply {
	public static void main(String[] args) {
		Rabbit1 r1 = new Rabbit1();
		Rabbit2 r2 = new Rabbit2();
		Rabbit3 r3 = new Rabbit3(true);
//		Rabbit4 r4 = new Rabbit4();  // DOES NOT COMPILE - private constructor - no other class can use it
	}
}