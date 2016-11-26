package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e24_formatting_dates_times;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

/**
 * Chapter 3: Core Java APIs<br>
 * Working with Dates and Times<br>
 * Formatting Dates and Times - pages 148-150
 */
public class FormattingDatesTimes {
	public static void main(String [] args) {

		// The date and time classes support many methods to get data out of them:
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());  // MONDAY
		System.out.println(date.getMonth());      // JANUARY
		System.out.println(date.getYear());       // 2020
		System.out.println(date.getDayOfYear());  // 20

		System.out.println();

		/* Java provides a class called DateTimeFormatter to help us out. Unlike the LocalDateTime class,
		 * DateTimeFormatter can be used to format any type of date and/or time object. What changes is
		 * the format. DateTimeFormatter is in the package java.time.format.*/
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));            // 2020-01-20
		System.out.println(time1.format(DateTimeFormatter.ISO_LOCAL_TIME));           // 11:12:34
		System.out.println(dateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));  // 2020-01-20T11:12:34

		System.out.println();

		// there are some predefined formats that are more useful
		DateTimeFormatter shortDateTimeFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTimeFormat.format(dateTime1));  // 1/20/20
		System.out.println(shortDateTimeFormat.format(date));       // 1/20/20
		//System.out.println(shortDateTime.format(time1));      // UnsupportedTemporalTypeException - time cannot be formatted as date

		System.out.println();

		/* The format() method is declared on both the formatter objects and the date/time objects,
		 * allowing you to reference the objects in either order. The following statements print exactly
		 * the same thing as the previous code: */
		System.out.println(dateTime1.format(shortDateTimeFormat));
		System.out.println(date1.format(shortDateTimeFormat));
		//System.out.println(time1.format(shortDateTimeFormat));  // UnsupportedTemporalTypeException - time cannot be formatted as date

		System.out.println();

		/* There are two predefined formats that can show up on the exam: SHORT and MEDIUM. The other predefined
		 * formats involve time zones, which are not on the exam. */
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime1));   // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime1));  // Jan 20, 2020 11:12:34 AM

		System.out.println();

		// create your own formatter
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime1.format(f));  // January 20, 2020, 11:12

		System.out.println();

		// formatting the old way
		Calendar c1 = Calendar.getInstance();
		c1.set(2015, Calendar.JANUARY, 3);
		Date jan3 = c1.getTime();
		SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
		System.out.println(sf.format(jan3));

		System.out.println();

		// review p150 - which line(s) will throw an exception?
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
		f1.format(dateTime1);
		//f.format(date1);  // This will throw exception - cannot use a time formatter for an object that only has a date
		f1.format(time1);
	}
}
