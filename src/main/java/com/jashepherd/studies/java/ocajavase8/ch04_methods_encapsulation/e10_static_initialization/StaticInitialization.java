package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e10_static_initialization;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Static Initialization<br>
 * pages 186-187
 */
public class StaticInitialization {

	/* In Chapter 1, we covered instance initializers that looked like unnamed methods. Just code
	 * inside braces. Static initializers look similar. They add the static keyword to specify they
	 * should be run when the class is first used. For example:*/
	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}

	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;  // DOES NOT COMPILE - four must be initialized but isn't
	static {
		one = 1;
		two = 2;
//		three = 3;  // DOES NOT COMPILE - cannot change a final var
//		two = 4;    // DOES NOT COMPILE - cannot change a final var
	}
}
