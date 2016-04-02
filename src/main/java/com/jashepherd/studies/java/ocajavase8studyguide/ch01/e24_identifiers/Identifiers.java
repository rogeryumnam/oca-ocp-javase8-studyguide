package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e24_identifiers;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Declaring and Initializing Variables<br/>
 * Declaring Multiple Variables - pages 28
 * <p>
 * There are only three rules to remember for legal identifiers:
 * <ol>
 * <li>The name must begin with a letter or the symbol $ or _.
 * <li>Subsequent characters may also be numbers.
 * <li>You cannot use the same name as a Java reserved word. As you might imagine, a
 * reserved word is a keyword that Java has reserved so that you are not allowed to use it.
 * Remember that Java is case sensitive, so you can use versions of the keywords that only
 * differ in case. Please don’t, though.</li>
 * </ol>
 */
public class Identifiers {
	// examples of legal identifiers
	int okidentifier;
	int $OK2Identifier;
	int _alsoOK1d3ntifi3r;
	int __SStillOkbutKnotsonice$;

	/* illegal identifiers
	int 3DPointClass   // identifiers cannot begin with a number
	int hollywood@vine // @ is not a letter, digit, $ or _
	int *$coffee       // * is not a letter, digit, $ or _
	int public         // public is a reserved word
	 */
}
