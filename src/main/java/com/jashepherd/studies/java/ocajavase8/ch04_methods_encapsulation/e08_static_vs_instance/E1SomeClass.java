package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e08_static_vs_instance;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Static vs. Instance<br>
 * page 183
 */
public class E1SomeClass {
	private String name = "E1SomeClass";
	public static void first() { }
	public static void second() { }
	public void third() { System.out.println(name); }
	public static void main(String args[]) {
		first();
		second();
//		third();  // DOES NOT COMPILE - trying to reference a nonstatic member from a static context
	}
}

// what about making third() static - still wont work because name is still not static
class SomeClass2 {
	private String name = "SomeClass2";
	public static void first() { }
	public static void second() { }
//	public static void third() { System.out.println(name); }  // third() is now a static member
	public static void main(String args[]) {
		first();
		second();
//		third();  // DOES NOT COMPILE - trying to reference a nonstatic member from a static context - name var is still not static
	}
}

// make everything static would work
class SomeClass3 {
	private static String name = "SomeClass3";
	public static void first() { }
	public static void second() { }
	public static void third() { System.out.println(name); }  // third() is now a static member
	public static void main(String args[]) {
		first();
		second();
		third();
	}
}

// also could have called third() through an object instance
class SomeClass4 {
	private String name = "SomeClass2";
	public static void first() { }
	public static void second() { }
	public void third() { System.out.println(name); }  // third() is now a static member
	public static void main(String args[]) {
		first();
		second();
		new SomeClass4().third();
	}
}