package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s03_packages_imports.e01_packages_imports;

import java.util.Random;  // import tells us where to find Random class

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Simple import - pages 9-10
 * <p>
 * The import statement tells the compiler which package to look in to find a class. The rule for package names is that they are
 * mostly letters or numbers separated by dots. The rules are the same as for variable names.
 */
public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));  // print a number between 0 and 9
	}
}
