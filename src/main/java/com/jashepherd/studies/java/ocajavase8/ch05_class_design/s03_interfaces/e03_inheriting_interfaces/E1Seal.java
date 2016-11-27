package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e03_inheriting_interfaces;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Inheriting an Interface - pages 269-270
 * <p>
 * Any class that implements the Seal interface must provide an implementation for all methods
 * in the parent interfaces—in this case, getTailLength() and getNumberOfWhiskers().
 */
public interface E1Seal extends E1HasTail, E1HasWhiskers {
}
