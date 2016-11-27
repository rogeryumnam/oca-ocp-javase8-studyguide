package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e07_package_b;

import com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e07_package_a.ClassA;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Creating a New Package - pages 13-15
 * <p>
 * The directory structure on your computer is related to the package name.<br>
 * ClassA path:
 * <code>C:\Users\Jeremy\Dropbox\Tech\Studies\Java\OCAJavaSE8StudyGuide\src\main\java\com\jashepherd\studies\java\ocajavase8\ch01_java_building_blocks\e07_package_a\ClassA.java</code><br>
 * ClassB path:
 * <code>C:\Users\Jeremy\Dropbox\Tech\Studies\Java\OCAJavaSE8StudyGuide\src\main\java\com\jashepherd\studies\java\ocajavase8\ch01_java_building_blocks\e07_package_b\ClassB.java</code><br>
 * <p>
 * Change directory<br>
 * <code>cd ~/Dropbox\Tech\Studies\Java\OCAJavaSE8StudyGuide\src\main\java\</code>
 * <p>
 * To compile:<br>
 * <code>javac com/jashepherd/studies/java/ocajavase8/ch01_java_building_blocks/e07_package_a/ClassA.java com/jashepherd/studies/java/ocajavase8/ch01_java_building_blocks/e07_package_b/ClassB.java</code><br><br>
 * This will create e07_package_a/ClassA.class and e07_package_b/ClassB.class files right beside the .java class files.
 * <p>
 * To run ClassA:<br>
 * <code>java com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e07_package_a.ClassA</code>
 * To run ClassB:<br>
 * <code>java com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s03_packages_imports.e07_package_b.ClassB</code>
 */
public class ClassB {
	public static void main(String[] args) {
		ClassA a;
		System.out.println("Got it");
	}
}
