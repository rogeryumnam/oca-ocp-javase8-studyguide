package com.jashepherd.studies.java.ocajavase8studyguide.ch05.e04_compiler_enhancements;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Understanding Compiler Enhancements - pages 241-243
 * <p>
 * Constructor Definition Rules:
 * <ol>
 *     <li>The first statement of every constructor is a call to another constructor within the class
 *         using this(), or a call to a constructor in the direct parent class using super().</li>
 *     <li>The super() call may not be used after the first statement of the constructor.</li>
 *     <li>If no super() call is declared in a constructor, Java will insert a no-argument super()
 *         as the first statement of the constructor. </li>
 *     <li>If the parent doesn’t have a no-argument constructor and the child doesn’t define any
 *         constructors, the compiler will throw an error and try to insert a default no-argument
 *         constructor into the child class. </li>
 *     <li>If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
 *         call to a parent constructor in each child constructor.</li>
 * </ol>
 */

/* In this example no constructor is defi ned within the Elephant class, so the compiler tries
 * to insert a default no-argument constructor with a super() call, as it did in the Donkey
 * example. The compiler stops, though, when it realizes there is no parent constructor that
 * takes no arguments. */
/*
public class E2Elephant extends E2Mammal {  // DOES NOT COMPILE
}
*/

/* This code still doesn’t compile, though, because the compiler tries to insert the no-argument
 * super() as the fi rst statement of the constructor in the Elephant class, and there
 * is no such constructor in the parent class. */
/*
public class E2Elephant extends E2Mammal {
	public E2Elephant() {  // DOES NOT COMPILE
	}
}
*/

/* This code will compile because we have added a constructor with an explicit call to a
 * parent constructor. Note that the class Elephant now has a no-argument constructor even
 * though its parent class Mammal doesn’t. Subclasses may defi ne no-argument constructors
 * even if their parent classes do not, provided the constructor of the child maps to a parent
 * constructor via an explicit call of the super() command. */
public class E2Elephant extends E2Mammal {
	public E2Elephant() {
		super(10);
	}
}
