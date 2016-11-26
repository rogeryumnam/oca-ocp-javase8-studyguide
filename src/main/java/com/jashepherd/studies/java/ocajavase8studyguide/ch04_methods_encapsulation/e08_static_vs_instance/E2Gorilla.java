package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e08_static_vs_instance;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Static vs. Instance<br>
 * page 184
 */
public class E2Gorilla {
	public static int count;
	public static void addGorilla() { count++; }
	public void babyGorilla() { count++; }
	public void announceBabies() {
		addGorilla();
		babyGorilla();
	}
	public static void announceBabiesToEveryone() {
		addGorilla();
//		babyGorilla();  // DOES NOT COMPILE - cannot call instance method from static method
	}
	public int total;
//	public static average = total / count; // DOES NOT COMPILE - cannot use instance variables from static context
}
