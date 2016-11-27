package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s02_abstract_classes.e04_extending_abstract_classes;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Extending an Abstract Class - pages 263-264
 */
public abstract class E1Animal {
	public abstract String getName();
}

/*
class Walrus extends E1Animal {  // DOES NOT COMPILE - 1st concrete subclass must implement all non-implemented inherited abstract classes
}
*/

// class does compile even though it does not implement getName() because it is marked as abstract
abstract class Eagle extends E1Animal {
}
