package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e06_same_named_classes;

import java.util.Date;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * How to use same named classes - page 13
 * <p>
 * Sometimes you really do want to use Date from two different packages. When this happens,
 * you can pick one to use in the import and use the other's fully qualified class name
 * (the package name, a dot, and the class name) to specify that it’s special.
 */
public class Conflicts {
	Date date;
	java.sql.Date sqlDate;
}

	/*
	 * Or you could have neither with an import and always use the fully qualified class name:
	 */
class Conflicts2 {
	java.util.Date date;
	java.sql.Date sqlDate;
}