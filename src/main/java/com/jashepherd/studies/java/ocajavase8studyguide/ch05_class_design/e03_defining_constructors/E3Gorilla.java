package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.e03_defining_constructors;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Defining Constructors - pages 238-240
 * <p>
 * If the parent class has more than one constructor, the child class may use any valid
 * parent constructor in its definition
 * <p>
 * In this example, the fi rst child constructor takes one argument, age, and calls the parent
 * constructor, which takes two arguments, age and name. The second child constructor
 * takes no arguments, and it calls the parent constructor, which takes one argument, age.
 * In this example, notice that the child constructors are not required to call matching parent
 * constructors. Any valid parent constructor is acceptable as long as the appropriate input
 * parameters to the parent constructor are provided.
 */
public class E3Gorilla extends E3Animal {
	public E3Gorilla(int age) {
		super(age, "Gorilla");
	}
	public E3Gorilla() {
		super(5);
	}
}
