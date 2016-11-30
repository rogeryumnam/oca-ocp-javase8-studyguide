package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e05_polymorphic_params;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Polymorphic Parameters - pages 285-286
 */
public class Reptile {
	public String getName() {
		return "Reptile";
	}
}

class Alligator extends Reptile {
	public String getName() {
		return "Alligator";
	}
}

class Crocodile extends Reptile {
	public String getName() {
		return "Crocodile";
	}
}

class ZooWorker {
	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile " + reptile.getName());
	}

	/* outputs:
	 * Feeding: Alligator
	 * Feeding: Crocodile
	 * Feeding: Reptile
	 */
	public static void main(String[] args) {
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());
	}
}
