package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s03_common_exceptions.e03_errors;

/**
 * Chapter 6: Exceptions<br>
 * Recognizing Common Exception Types<br>
 * Errors - page 317
 * <p>
 * Errors extend the Error class. They are thrown by the JVM and should not be handled or
 * declared. Errors are rare, but you might see these:
 * <dl>
 *     <dt><strong>ExceptionInInitializerError</strong></dt>
 *     <dd>Thrown by the JVM when a static initializer throws an exception and doesn’t handle it</dd>
 *     <dt><strong>StackOverflowError</strong></dt>
 *     <dd>Thrown by the JVM when a method calls itself too many times (this is called infinite recursion because the method
 *         typically calls itself without end)</dd>
 *     <dt><strong>NoClassDefFoundError</strong></dt>
 *     <dd>Thrown by the JVM when a class that the code uses is available at compile time but not runtime</dd>
 * </dl>
 */
public class Errors {
}
