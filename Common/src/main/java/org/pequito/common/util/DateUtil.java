package org.pequito.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.pequito.common.type.DateFormats;

/**
 * Class which provides function on Date and Calendar
 *
 * @author Adrien
 */
public final class DateUtil {

	/**
	 * Private constructor
	 */
	private DateUtil() {
		// Not accessible
	}

	/**
	 * Method which format a date into string according to the given date format
	 *
	 * @param date
	 *            The date
	 * @param dateFormat
	 *            The date format
	 * @return The string date
	 */
	public static String format(Date date, DateFormats dateFormat) {
		if ((date != null) && (dateFormat != null)) {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat.getFormatString());
			return sdf.format(date);
		} else {
			return null;
		}
	}

	/**
	 * Method which format a calendar into string according to the given date
	 * format
	 *
	 * @param calendar
	 *            The calendar
	 * @param dateFormat
	 *            The date format
	 * @return The string date
	 */
	public static String format(Calendar calendar, DateFormats dateFormat) {
		if (calendar != null) {
			return DateUtil.format(calendar.getTime(), dateFormat);
		} else {
			return null;
		}
	}

	/**
	 * Method which parses a string into a date according to the given date
	 * format
	 *
	 * @param string
	 *            The string date
	 * @param dateFormat
	 *            The date format
	 * @return The date
	 */
	public static Date parse(String string, DateFormats dateFormat) {
		if ((string != null) && (dateFormat != null)) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat.getFormatString());
				return sdf.parse(string);
			} catch (ParseException e) {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Method which parses a string into a date according to the given date
	 * format
	 *
	 * @param string
	 *            The string date
	 * @param dateFormat
	 *            The date format
	 * @return The date
	 */
	public static Calendar parseCalendar(String string, DateFormats dateFormat) {
		Date date = DateUtil.parse(string, dateFormat);
		if (date != null) {
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			return calendar;
		} else {
			return null;
		}
	}

	/**
	 * Method which adds the amount of <b>field</b> to the given <b>calendar</b>
	 * Does not change the calendar passed in parameter
	 *
	 * @param calendar
	 *            The calendar
	 * @param field
	 *            The field to add
	 * @param amount
	 *            The amount to add
	 * @return The modified calendar
	 */
	public static Calendar add(Calendar calendar, int field, int amount) {
		if (calendar != null) {
			Calendar newCalendar = (Calendar) calendar.clone();
			newCalendar.add(field, amount);
			return newCalendar;
		} else {
			return null;
		}
	}

	/**
	 * Method which adds the amount of <b>field</b> to the given <b>date</b>
	 * Does not change the date passed in parameter
	 *
	 * @param calendar
	 *            The calendar
	 * @param field
	 *            The field to add
	 * @param amount
	 *            The amount to add
	 * @return The modified date
	 */
	public static Date add(Date date, int field, int amount) {
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(field, amount);
			return calendar.getTime();
		} else {
			return null;
		}
	}
}