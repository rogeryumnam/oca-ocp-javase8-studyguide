package com.jashepherd.studies.java.ocajavase8.ch03_core_java_apis.e21_creating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Chapter 3: Core Java APIs<br>
 * Working with Dates and Times<br>
 * Creating Dates and Times - pages 138-142
 */
public class CreatingDatesTimes {
	public static void main(String[] args) {
		// create date and time objects for the current date and time
		System.out.println(LocalDate.now());      // 2015-01-20
		System.out.println(LocalTime.now());      // 12:45:18.401
		System.out.println(LocalDateTime.now());  // 2015-01-20T12:45:18.401

		// create date objects with no time specifying the date - no time zone
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);

		// create time objects with no date specifying the time - no time zone
		LocalTime time1 = LocalTime.of(6, 15);           // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30);       // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);  // + nanoseconds

		// create date/time objects specifying the date/time - no time zone
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

		// there are no public constructors, you must use the static methods to create date/time objects
		//LocalDate d = new LocalDate(); // DOES NOT COMPILE

		LocalDate.of(2015, Month.JANUARY, 32);  // throws DateTimeException - there is no 32 day of January

		// old ways to create a date with the current time
		Date d = new Date();

		Calendar c1 = Calendar.getInstance();
		c1.set(2015, Calendar.JANUARY, 1);
		Date d1 = c1.getTime();
		// or
		Calendar c2 = new GregorianCalendar(2015, Calendar.JANUARY, 1);
		Date d2 = c2.getTime();
		// or creating date without the month constant
		Calendar c3 = Calendar.getInstance();
		c3.set(2015, 0, 1);
		Date d3 = c1.getTime();
	}
}
