package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e20_creating_immutable_classes;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Encapsulating Data<br>
 * Creating Immutable Classes - page 207
 */
public class E1ImmutableSwan {
	private int numberEggs;
	public E1ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	public int getNumberEggs() {
		return numberEggs;
	}
}
