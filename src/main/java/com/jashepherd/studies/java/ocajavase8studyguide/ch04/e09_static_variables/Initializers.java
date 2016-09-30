package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e09_static_variables;

import java.util.ArrayList;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Static Variables<br>
 * pages 185-186
 */
public class Initializers {
	private static int counter = 0;  // initialization

	private static final int NUM_BUCKETS = 45;  // final variable aka constant

	private static final ArrayList<String> values = new ArrayList<>();  //  final object reference - object can change but reference cannot

	public static void main(String[] args) {
//		NUM_BUCKETS = 5;  // DOES NOT COMPILE - final variables cannot change value

		values.add("changed");
//		values = new ArrayList<>();  // DOES NOT COMPILE - object reference is final and cannot point to a different object than the original
	}
}
