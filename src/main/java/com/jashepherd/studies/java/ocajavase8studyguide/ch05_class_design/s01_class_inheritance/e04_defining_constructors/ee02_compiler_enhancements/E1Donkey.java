package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e04_defining_constructors.ee02_compiler_enhancements;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Understanding Compiler Enhancements - pages 241-243
 * <p>
 * The following three class and constructor definitions are equivalent because the compiler will
 * automatically convert them all to the last example.
 * <p>
 * Java compiler automatically inserts a call to the no-argument constructor super() if the first
 * statement is not a call to the parent constructor.
 */
class Donkey1 {
}

class Donkey2 {
	public Donkey2() {
	}
}

class Donkey3 {
	public Donkey3() {
		super();
	}
}