package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s08_variable_scope;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Variable Scope<br/>
 * pages 31-33
 */
public class A1VariableScope {

	// two local variables declared - both have a scope local to the method
	public void eat(int piecesOfCheese) {  // method parameter
		int bitesOfCheese = 1;  // local variable
	}

	public void eatIfHungry(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
		}  // bitesOfCheese goes out of scope here
		// System.out.println(bitesOfCheese);  // DOES NOT COMPILE - out of scope
	}

	/* blocks can contain other blocks. These smaller contained blocks can reference
	variables defined in the larger scoped blocks, but not vice versa. */
	public void eatIfHungry2(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
			{
				boolean teenyBit = true;
				System.out.println(bitesOfCheese);
			}
		}
		// System.out.println(teenyBit); // DOES NOT COMPILE - teenyBit out of scope
	}

	public void eatMore(boolean hungry, int amountOfFood) {
		int roomInBelly = 5;
		if (hungry) {
			boolean timeToEat = true;
			while (amountOfFood > 0) {
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
			}
		}
		System.out.println(amountOfFood);
	}
}
