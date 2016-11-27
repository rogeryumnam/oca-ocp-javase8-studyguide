package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s02_abstract_classes.e04_extending_abstract_classes;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Extending an Abstract Class - pages 264-265
 */
public abstract class E3Animal {
	public abstract String getName();
}

abstract class E3BigCat extends E3Animal {
	public String getName() {  // abstract classes may also include implementation methods
		return "BigCat";
	}
	public abstract void roar();
}

// E3Lion only has to implement roar() since the abstract class E3BigCat took care of the implementation of getName()
class E3Lion extends E3BigCat {
	public void roar() {
		System.out.println("The Lion lets out a load ROAR!");
	}
}