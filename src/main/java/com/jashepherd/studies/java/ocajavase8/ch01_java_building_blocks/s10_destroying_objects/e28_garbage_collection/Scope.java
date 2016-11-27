package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s10_destroying_objects.e28_garbage_collection;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Destroying Objects<br/>
 * Garbage Collection - page 37
 */
public class Scope {
	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;  // the object holding String "a" is now eligible for garbage collection
		System.gc();  // suggest to the JVM that now is a good time to run garbage collection - not guaranteed!
		String three = one;
		one = null;
	}
}
