package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects;

import com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e01.HasTail;
import com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e01.Primate;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Casting Objects - pages 282-283
 * <p>
 * In this example, we first try to convert the primate reference back to a lemur reference,
 * lemur2, without an explicit cast. The result is that the code will not compile. In the second
 * example, though, we explicitly cast the object to a subclass of the object Primate and we
 * gain access to all the methods available to the Lemur class.
 * <ol>
 *     <li>Casting an object from a subclass to a superclass doesn’t require an explicit cast.</li>
 *     <li>Casting an object from a superclass to a subclass requires an explicit cast.</li>
 *     <li>The compiler will not allow casts to unrelated types.</li>
 *     <li>Even when the code compiles without issue, an exception may be thrown at runtime if
 *         the object being cast is not actually an instance of that class.</li>
 * </ol>
 */
public class E1Lemur extends Primate implements HasTail{
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		E1Lemur lemur = new E1Lemur();
		Primate primate = lemur;
//		E1Lemur lemur2 = primate;  // DOES NOT COMPILE - cannot cast to child without explicit cast

		E1Lemur lemur3 = (E1Lemur) primate;
		System.out.println(lemur3.age);  // 10
	}
}
