package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e05_calling_inherited_class_members;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - pages 244-246
 */
public class Shark extends Fish {
	private int numberOfFins = 8;

	public Shark(int age) {
		super(age);
		this.size = 4;
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());      // uses public member getAge() from parent
		System.out.print(" and " + size + " meters long");    // uses protected member size from parent
		System.out.print(" with " + numberOfFins + " fins");  // uses this classes own private member
	}

	// using the 'this' keyword
	public void displaySharkDetails2() {
		System.out.print("Shark with age: " + this.getAge());
		System.out.print(" and " + this.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
	}

	// using 'super' for parent members and 'this' for current class members
	public void displaySharkDetails3() {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
	}

	public void displaySharkDetails4() {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
//		System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE - numberOfFins is not in the parent class
	}

	public static void main(String... args) {
		new Shark(1).displaySharkDetails();
		new Shark(2).displaySharkDetails2();
		new Shark(3).displaySharkDetails3();
		new Shark(4).displaySharkDetails4();
	}
}
