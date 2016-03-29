package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e16_package_b;

import com.jashepherd.studies.java.ocajavase8studyguide.ch01.e16_package_a.ClassA;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Creating a New Package - pages 13-14
 * <p>
 * The directory structure on your computer is related to the package name.<br>
 * ClassA path:
 * <code>C:\Users\Jeremy\Dropbox\Tech\Studies\Java\OCAJavaSE8StudyGuide\src\main\java\com\jashepherd\studies\java\ocajavase8studyguide\ch01\e16_package_a\ClassA.java</code><br>
 * ClassB path:
 * <code>D:\Users\Jeremy\Dropbox\Tech\Studies\Java\OCAJavaSE8StudyGuide\src\main\java\com\jashepherd\studies\java\ocajavase8studyguide\ch01\e16_package_a\ClassB.java</code><br>
 * <p>
 * Change directory<br>
 * <code>cd ~/Dropbox\Tech\Studies\Java\OCAJavaSE8StudyGuide\src\main\java\</code>
 * <p>
 * To compile:<br>
 * <code>javac com/jashepherd/studies/java/ocajavase8studyguide/ch01/e16_package_a/ClassA.java com/jashepherd/studies/java/ocajavase8studyguide/ch01/e16_package_b/ClassB.java</code><br><br>
 * This will create e16_package_a/ClassA.class and e16_package_a/ClassB.class files.
 * <p>
 * To run:<br>
 * <code>java com.jashepherd.studies.java.ocajavase8studyguide.ch01.e16_package_b.ClassB</code>
 */
public class ClassB {
	public static void main(String[] args) {
		ClassA a;
		System.out.println("Got it");
	}
}
