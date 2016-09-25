package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e25_parsing_dates_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Chapter 3: Core Java APIs<br>
 * Working with Dates and Times<br>
 * Parsing Dates and Times - page 151
 */
public class ParsingDatesTimes {
	public static void main(String args []) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);  // 2015-01-02
		System.out.println(time);  // 11:22
	}
}
