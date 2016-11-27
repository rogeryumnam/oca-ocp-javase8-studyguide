package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e21_lambda_example;

import java.util.ArrayList;
import java.util.List;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Writing Simple Lambdas<br>
 * Lambda Example - pages 208-211
 * <p>
 * Our goal is to print out all the animals in a list according to some criteria. We’ll show you
 * how to do this without lambdas to illustrate how lambdas are useful.
 */
public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}

interface CheckTrait {
	boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}

class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();  // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, new CheckIfHopper());  // pass class that does check

		// line above as a lambda expression
		print(animals, a -> a.canHop());

		// How about animals that can swim as a lambda
		print(animals, a -> a.canSwim());

		// how about animals that cannot swim
		print(animals, a -> ! a.canSwim());
	}
	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}