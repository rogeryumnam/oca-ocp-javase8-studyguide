package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e02_import_wildcards;

import java.util.*;  // imports java.util.Random among other things

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Wildcards - page 10
 * <p>
 * Classes in the same package are often imported together. You can use a shortcut to import all
 * the classes in a package. The * is a wildcard that matches all classes in the package. Every
 * class in the java.util package is available to this program when Java compiles it. It doesn't
 * import child packages, fields, or methods; it imports only classes.
 */
public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}
