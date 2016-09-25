package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e17_wrapper_classes;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding an ArrayList<br>
 * Wrapper Classes - pages 134-135
 */
public class WrapperClasses {
	public static void main(String... args) {
		boolean boolean1 = Boolean.parseBoolean("true");
		Boolean booleanWrapper = Boolean.valueOf("true");

		byte byte1 = Byte.parseByte("1");
		Byte byteWrapper = Byte.valueOf("2");

		short short1 = Short.parseShort("1");
		Short shortWrapper = Short.valueOf("2");

		int int1 = Integer.parseInt("1");
		Integer integerWrapper = Integer.valueOf("2");

		long long1 = Long.parseLong("1");
		Long longWrapper = Long.valueOf("2");

		float float1 = Float.parseFloat("1");
		Float floatWrapper = Float.valueOf("2.2");

		double double1 = Double.parseDouble("1");
		Double doubleWrapper = Double.valueOf("2.2");


	}
}
