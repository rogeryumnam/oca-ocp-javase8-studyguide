package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e11_static_imports;

import java.util.List;
import static java.util.Arrays.asList;  // static import

 /**
 * Chapter 4: Methods and Encapsulation<br>
 * Static Imports<br>
 * pages 187-188
 */
public class E2StaticImports {
	 public static void main(String[] args) {
		 List<String> list = asList("one", "two");  // no Arrays when using static method asList()
	 }
}
