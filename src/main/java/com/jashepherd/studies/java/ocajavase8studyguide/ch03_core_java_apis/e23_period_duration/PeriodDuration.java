package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e23_period_duration;

import java.time.*;

/**
 * Chapter 3: Core Java APIs<br>
 * Working with Dates and Times<br>
 * Working with Periods - pages 145-147
 * <p>
 * Period is for days or larger<br>
 * Duration is for less than a day
 */
public class PeriodDuration {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(start, end);

		Period period = Period.ofMonths(1);  // create a period
		performAnimalEnrichment(start, end, period);

		// 5 ways to create a Period
		Period annually = Period.ofYears(1);            // every 1 year
		Period quarterly = Period.ofMonths(3);          // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3);     // every 3 weeks
		Period everyOtherDay = Period.ofDays(2);        // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7);  // every year and 7 days

		// you cannot chain period methods
		Period wrong = Period.ofYears(1).ofWeeks(1);    // every week

		// the code above is really like writing the following
		Period wrong1 = Period.ofYears(1);
		wrong1 = Period.ofWeeks(7);

		// Duration
		Duration d1 = Duration.ofHours(3);     // every 3 hours
		Duration d2 = Duration.ofMinutes(30);  // every half hour
		Duration d3 = Duration.ofSeconds(45);  // every 45 seconds
		Duration d4 = Duration.ofMillis(100);  // every 100 milliseconds
		Duration d5 = Duration.ofNanos(1000);  // every 1000 nanoseconds

		System.out.println();

		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period1 = Period.ofMonths(1);
		System.out.println(date.plus(period1));      // 2015-02-20
		System.out.println(dateTime.plus(period1));  // 2015-02-20T06:15
		// attempt to add a month to an object that only has time
		System.out.println(time.plus(period1));      // UnsupportedTemporalTypeException
	}

	/*	This code works fine. It adds a month to the date until it hits the end date. The problem
	 * is that this method can’t be reused. Our zookeeper wants to try different schedules to see
	 *	which works best. */
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {   // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);  // add a month
		}
	}

	/* This code does the same thing as the previous example. The method can add an arbitrary period of time
	 * that gets passed in. This allows us to reuse the same method for different periods of time as our
	 * zookeeper changes her mind.*/
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {  // uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);  // adds the period
		}
	}
}
