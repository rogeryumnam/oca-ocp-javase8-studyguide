package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e08_static_vs_instance;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Static vs. Instance<br>
 * pages 184-185
 */
public class E3StaticCounter {
	private static int count;
	public E3StaticCounter() { count++; }

	public static void main(String... args) {
		E3StaticCounter c1 = new E3StaticCounter();
		E3StaticCounter c2 = new E3StaticCounter();
		E3StaticCounter c3 = new E3StaticCounter();  // each time the constructor gets called, it increments count by 1
		System.out.println(count);  // 3
	}
}
