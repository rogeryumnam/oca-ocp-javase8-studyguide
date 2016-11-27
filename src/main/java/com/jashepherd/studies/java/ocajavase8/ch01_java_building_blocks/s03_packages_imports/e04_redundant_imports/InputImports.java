package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e04_redundant_imports;

import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Could have also used:
 * import java.nio.file.*;
 */

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Redundant Imports - pages 11-12
 * <p>
 * Java automatically looks in the current package for other classes. In other words, you don't have to import
 * a class that is in the same package as the class importing it.
 * <p>
 * Examples of imports that won't work:<br/>
 * <code>import java.nio.*;</code> // NO GOOD – a wildcard only matches class names, not "file.*Files"<br/>
 * <code>import java.nio.*.*;</code> // NO GOOD – you can only have one wildcard and it must be at the end<br/>
 * <code>import java.nio.files.Paths.*;</code> // NO GOOD – you cannot import methods only class names<br/>
 */
public class InputImports {
	public void read(Files files) {
		Paths.get("name");
	}
}
