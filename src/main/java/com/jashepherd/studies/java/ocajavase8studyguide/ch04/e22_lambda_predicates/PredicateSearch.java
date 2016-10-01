package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e22_lambda_predicates;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e21_lambda_example.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Writing Simple Lambdas<br>
 * Lambda Example - pages 214-215
 */
public class PredicateSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));

		print(animals, a -> a.canHop());
	}
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
			}
		System.out.println();
	}
}
