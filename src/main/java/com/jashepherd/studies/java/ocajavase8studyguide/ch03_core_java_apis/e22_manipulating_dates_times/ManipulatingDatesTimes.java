package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e22_manipulating_dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/**
 * Chapter 3: Core Java APIs<br>
 * Working with Dates and Times<br>
 * Manipulating Dates and Times - pages 142-145
 */
public class ManipulatingDatesTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);

		// going forward in time
		System.out.println(date);  // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date);  // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date);  // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date);  // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date);  // 2019-02-28

		System.out.println();

		// going backward in time
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(5, 15);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);       // 2020-01-20T05:15
		dateTime1 = dateTime1.minusDays(1);
		System.out.println(dateTime1);       // 2020-01-19T05:15
		dateTime1 = dateTime1.minusHours(10);
		System.out.println(dateTime1);       // 2020-01-18T19:15
		dateTime1 = dateTime1.minusSeconds(30);
		System.out.println(dateTime1);       // 2020-01-18T19:14:30

		System.out.println();

		/* It is common for date and time methods to be chained. For example, without the print
		 * statements, the previous example could be rewritten as follows: */
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(5, 15);
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2).minusDays(1).minusHours(10).minusSeconds(30);

		// bad example
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		date3.plusDays(10);  // this result is ignored because it isn't assigned to anything
		System.out.println(date3);

		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
		//date4 = date4.plusMinutes(1); // DOES NOT COMPILE - LocalDate does not include time
	}

	// new ways - simple
	// adding a day
	public LocalDate addDay(LocalDate date) {
		return date.plusDays(1);
	}

	// subtracting a day
	public LocalDate subtractDay(LocalDate date) {
		return date.minusDays(1);
	}

	// old ways - a lot of code to do a simple thing
	// adding a day
	public Date addDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}

	// subtracting a day
	public Date subtractDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}
}
