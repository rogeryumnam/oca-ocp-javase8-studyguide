package com.jashepherd.studies.java.ocajavase8studyguide.ch05.e05_calling_constructors;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Constructors - pages 243-244
 * <p>
 * In Java, the parent constructor is always executed before the child constructor.
 * <p>
 * output: <br>
 * <code>
 * Primate<br>
 * Ape
 * </code>
 */
class Primate {
	public Primate() {
		System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape() {
		System.out.println("Ape");
	}
}

class Chimpanzee extends Ape {
	public static void main(String[] args) {
		new Chimpanzee();  // primate ape
	}
}
