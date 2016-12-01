package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s03_common_exceptions.e02_checked_exceptions;

/**
 * Chapter 6: Exceptions<br>
 * Recognizing Common Exception Types<br>
 * Checked Exceptions - page 317
 * <p>
 * Checked exceptions have Exception in their hierarchy but not RuntimeException. They
 * must be handled or declared. They can be thrown by the programmer or by the JVM.
 * Common runtime exceptions include the following:
 * <dl>
 *     <dt><strong>FileNotFoundException</strong></dt>
 *     <dd>Thrown programmatically when code tries to reference a file that does not exist</dd>
 *     <dt><strong>IOException</strong></dt>
 *     <dd>Thrown programmatically when there’s a problem reading or writing a fi le</dd>
 * </dl>
 * <p>
 * For the OCA exam, you only need to know that these are checked exceptions. Also keep
 * in mind that FileNotFoundException is a subclass of IOException, although the exam will
 * remind you of that fact if it comes up. You’ll see these two exceptions in more detail on the
 * OCP exam.
 */
public class CheckedExceptions {
}
