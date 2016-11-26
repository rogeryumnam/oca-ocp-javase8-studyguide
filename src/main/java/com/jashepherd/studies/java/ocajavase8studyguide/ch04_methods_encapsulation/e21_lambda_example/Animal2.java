package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e21_lambda_example;

import java.util.ArrayList;
import java.util.List;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Writing Simple Lambdas<br>
 * Lambda Example - pages 208-211
 * <p>
 * rewritten without the CheckIfHopper class
 */
public class Animal2 {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal2(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}

interface CheckTrait2 {
	boolean test(Animal2 a);
}

class TraditionalSearch2 {
	public static void main(String[] args) {
		List<Animal2> animals = new ArrayList<>();  // list of animals
		animals.add(new Animal2("fish", false, true));
		animals.add(new Animal2("kangaroo", true, false));
		animals.add(new Animal2("rabbit", true, false));
		animals.add(new Animal2("turtle", false, true));

		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		print(animals, a -> ! a.canSwim());
	}

	private static void print(List<Animal2> animals, CheckTrait2 checker) {
		for (Animal2 animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}
