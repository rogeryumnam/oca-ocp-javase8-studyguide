package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s02_abstract_classes.e01;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * pages 259-260
 */
public class Swan extends Animal {
	public String getName() {  // must implement getName() since it was marked abstract in parent
		return "Swan";
	}
}
