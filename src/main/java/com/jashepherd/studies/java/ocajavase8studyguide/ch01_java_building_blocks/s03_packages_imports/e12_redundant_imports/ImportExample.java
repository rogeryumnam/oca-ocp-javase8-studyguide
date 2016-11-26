package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s03_packages_imports.e12_redundant_imports;

import java.lang.System;  // redundant import
import java.lang.*;       // redundant import
import java.util.Random;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Redundant Imports - page 11
 * <p>
 * The java.lang package is special in that it is automatically imported. You may use specific classes in imports
 * or wildcards, but you don't have to use both simultaneously.
 */
public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}
