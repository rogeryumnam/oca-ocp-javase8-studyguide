package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e18_autoboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding an ArrayList<br>
 * Autoboxing - page 136
 */
public class Autoboxing {
	public static void main(String[] args) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);              // [50.5]        autoboxing
		weights.add(new Double(60));    // [50.5, 60.0]  old way
		weights.remove(50.5);           // [60.0]        autoboxing
		double first = weights.get(0);  // 60.0          unboxing

		List<Integer> heights = new ArrayList<>();
		heights.add(null);
//		int h = heights.get(0);  // NullPointerException

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);  // be careful, this remove index 1 of the ArrayList
		System.out.println(numbers);  // 1
	}
}
