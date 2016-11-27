package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e13_overloading_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Methods<br>
 * Putting it all Together - pages 194-196
 */
public class E6PuttingItAllTogether {
	public static void main(String[] args) {
		Glider2 glider2 = new Glider2();
		System.out.print(glider2.glide("a"));            // calls the String version
		System.out.print(glider2.glide("a", "b"));       // calls the two Strings version
		System.out.print(glider2.glide("a", "b", "c"));  // calls the String vararg version

		TooManyConversions tmc = new TooManyConversions();
//		tmc.play(4);   // DOES NOT COMPILE - Java cannot do a 2 step conversion - cannot convert int to long and then autobox long to Long
		tmc.play(4L);  // long autoboxes to Long
	}
}

class Glider2 {
	public String glide(String s) {
		return "1";
	}
	public String glide(String... s) {
		return "2";
	}
	public String glide(Object o) {
		return "3";
	}
	public String glide(String s, String t) {
		return "4";
	}
}

class TooManyConversions {
	public void play(Long l) {}
	public void play(Long... l) {}
}
