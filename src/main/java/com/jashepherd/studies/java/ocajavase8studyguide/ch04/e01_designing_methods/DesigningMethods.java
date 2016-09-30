package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e01_designing_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Designing Methods<br>
 * Access Modifiers, Optional Specifiers, Return Type, Method Name, Parameter List, Optional Exception List,
 * Method Body - pages 166-172
 * <p>
 *
 */
public class DesigningMethods {

	// a basic method
	public final void nap(int minutes) throws InterruptedException {
		// take a nap
	}

	// access modifiers
	// public, protected, default, private
	public void walk1() {}
//	default void walk2() {}  // DOES NOT COMPILE - omit modifier for  default access
//	void public walk3() {}   // DOES NOT COMPILE - access modifier return type in wrong order
	void walk4() {}

	// option specifiers
	// static, abstract, final, synchronized, native, strictfp
	public void step1() {}
	public final void step2() {}
	public static final void step3() {}
	public final static void step4() {}
//	public modifier void step5() {}  // DOES NOT COMPILE - modifier not a valid optional specifier
//	public void final step6() {}     // DOES NOT COMPILE - return type and option specifier in wrong order
	final public void step7() {}

	// return type
	public void run1() { }
	public void run2() { return; }
	public String run3() { return ""; }
//	public String run4() { }  // DOES NOT COMPILE - missing return type
//	public run5() { }         // DOES NOT COMPILE - must have return type - void would work in this case
//	String run6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE - return statement may not always execute

	// return value must be compatible with return type
	int integer() {
		return 9;
	}
	int long1() {
//		return 9L;  // DOES NOT COMPILE
		return 9;
	}
	long long2() {
		return 9;  // int fits into a long
	}
	long long3() {
		return 9L;
	}
	int integerExpanded() {
		int temp = 9;
		return temp;
	}
	int longExpanded() {
//		int temp = 9L;  //DOES NOT COMPILE
		int temp = 9;
		return temp;
	}

	// method name
	public void skip1() { }
//	public void 2skip() { }  // DOES NOT COMPILE - cannot begin with number
//	public skip3 void() { }  // DOES NOT COMPILE - return type and method name in wrong order
	public void Skip_$() { }
//	public void() { }        // DOES NOT COMPILE - method name omitted

	// parameter list
	public void jump1() { }
//	public void jump2 { }                // DOES NOT COMPILE - parenthesis omitted
	public void jump3(int a) { }
//	public void jump4(int a; int b) { }  // DOES NOT COMPILE - semicolon not permitted, use comma
	public void jump5(int a, int b) { }

	// optional exception list
	public void zeroExceptions() { }
	public void oneException() throws IllegalArgumentException { }
	public void twoExceptions() throws IllegalArgumentException, InterruptedException { }

	// method body
	public void shimmy1() { }
//	public void shimmy2;  // DOES NOT COMPILE - parenthesis and code block omitted
	public void shimmy3(int a) { int name = 5; }
}
