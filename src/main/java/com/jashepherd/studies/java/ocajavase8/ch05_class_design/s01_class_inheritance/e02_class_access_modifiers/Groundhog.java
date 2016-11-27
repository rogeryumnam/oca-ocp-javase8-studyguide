package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e02_class_access_modifiers;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Applying Class Access Modifiers - page 237
 * <p>
 * public and default are the only permitted class modifiers.
 * <p>
 * A java file may only have one public class and if it does, the filename must match the public class name.
 * A java file may have any number of default class in it.
 */
public class Groundhog extends Rodent{}

// If we wanted to make Rodent class public, it would have to be moved to its own file named Rodent.java
class Rodent {}

class SomeOtherClass1 {}
class SomeOtherClass2 {}