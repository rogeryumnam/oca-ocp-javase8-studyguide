package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e22_lambda_predicates;

import java.util.ArrayList;
import java.util.List;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Writing Simple Lambdas<br>
 * Predicates - page 215
 */
public class E2PredicateExample {
	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);  // [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);  // [hoppy
	}
}
