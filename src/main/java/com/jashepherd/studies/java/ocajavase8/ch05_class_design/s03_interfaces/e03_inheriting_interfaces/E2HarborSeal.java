package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e03_inheriting_interfaces;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Inheriting an Interface - pages 269-270
 * <p>
 * Abstract classes do not have to implement inherited interface methods
 */
public abstract class E2HarborSeal implements E1HasTail, E1HasWhiskers {
}

/*
class LeopardSeal implements E1HasTail, E1HasWhiskers {  // DOES NOT COMPILE - concrete class must implement inherited methods
}
*/
