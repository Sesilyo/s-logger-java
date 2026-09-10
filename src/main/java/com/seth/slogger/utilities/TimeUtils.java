// FILENAME: TimeUtil.java
package com.seth.slogger.utilities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class TimeUtils {
	private TimeUtils() {
		throw new UnsupportedOperationException("Cannot instantiate. This is a utility class.");
	}
	
	public static String dateToday() {
		return LocalDate.now().toString();
	}
	
	public static String timeNow() {
		return LocalTime.now()
				.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}
}