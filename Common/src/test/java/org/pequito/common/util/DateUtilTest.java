package org.pequito.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import com.pequito.common.type.DateFormats;

public class DateUtilTest {
	/** Year */
	private static final int YEAR = 2016;
	/** Month */
	private static final int MONTH = 06;
	/** Day */
	private static final int DAY = 21;
	/** Hour */
	private static final int HOUR = 15;
	/** Minute */
	private static final int MINUTE = 35;
	/** Second */
	private static final int SECOND = 52;
	/** Millisecond */
	private static final int FRACTION = 456;

	/** Date year */
	private static final String DATE_YEAR = "2016";
	/** Date month */
	private static final String DATE_MONTH = "2016-07";
	/** Date day */
	private static final String DATE_DAY = "2016-07-21";
	/** Date time hour */
	private static final String DATETIME_HOUR = "2016-07-21 15";
	/** Date time minute */
	private static final String DATETIME_MINUTE = "2016-07-21 15:35";
	/** Date time second */
	private static final String DATETIME_SECOND = "2016-07-21 15:35:52";
	/** Date time milliseconds */
	private static final String DATETIME_FRACTION = "2016-07-21 15:35:52.456";
	/** Time hour */
	private static final String TIME_HOUR = "15";
	/** Time minute */
	private static final String TIME_MINUTE = "15:35";
	/** Time seconds */
	private static final String TIME_SECOND = "15:35:52";
	/** Time milliseconds */
	private static final String TIME_FRACTION = "15:35:52.456";

	/** Positive amount of month */
	private static final int PLUS_MONTH = 6;
	/** Negative amount of month */
	private static final int MINUS_MONTH = -8;
	/** Date time + PLUS_MONTH months */
	private static final String DATETIME_FRACTION_PLUS_MONTHS = "2017-01-21 15:35:52.456";
	/** Date time - MINUS_MONTH months */
	private static final String DATETIME_FRACTION_MINUS_MONTHS = "2015-11-21 15:35:52.456";

	@Test
	public void testFormat() {
		Assert.assertNull(DateUtil.format((Date) null, DateFormats.DATE_DAY));
		Assert.assertNull(DateUtil.format((Calendar) null, DateFormats.DATE_DAY));
		Assert.assertNull(DateUtil.format(new Date(), null));
		Assert.assertNull(DateUtil.format(Calendar.getInstance(), null));

		Calendar calendar = this.generateCalendar();
		Date date = calendar.getTime();

		Assert.assertEquals(DateUtilTest.DATE_YEAR, DateUtil.format(date, DateFormats.DATE_YEAR));
		Assert.assertEquals(DateUtilTest.DATE_MONTH, DateUtil.format(date, DateFormats.DATE_MONTH));
		Assert.assertEquals(DateUtilTest.DATE_DAY, DateUtil.format(date, DateFormats.DATE_DAY));
		Assert.assertEquals(DateUtilTest.DATETIME_HOUR, DateUtil.format(date, DateFormats.DATETIME_HOUR));
		Assert.assertEquals(DateUtilTest.DATETIME_MINUTE, DateUtil.format(date, DateFormats.DATETIME_MINUTE));
		Assert.assertEquals(DateUtilTest.DATETIME_SECOND, DateUtil.format(date, DateFormats.DATETIME_SECOND));
		Assert.assertEquals(DateUtilTest.DATETIME_FRACTION, DateUtil.format(date, DateFormats.DATETIME_FRACTION));
		Assert.assertEquals(DateUtilTest.TIME_HOUR, DateUtil.format(date, DateFormats.TIME_HOUR));
		Assert.assertEquals(DateUtilTest.TIME_MINUTE, DateUtil.format(date, DateFormats.TIME_MINUTE));
		Assert.assertEquals(DateUtilTest.TIME_SECOND, DateUtil.format(date, DateFormats.TIME_SECOND));
		Assert.assertEquals(DateUtilTest.TIME_FRACTION, DateUtil.format(date, DateFormats.TIME_FRACTION));

		Assert.assertEquals(DateUtilTest.DATE_YEAR, DateUtil.format(calendar, DateFormats.DATE_YEAR));
		Assert.assertEquals(DateUtilTest.DATE_MONTH, DateUtil.format(calendar, DateFormats.DATE_MONTH));
		Assert.assertEquals(DateUtilTest.DATE_DAY, DateUtil.format(calendar, DateFormats.DATE_DAY));
		Assert.assertEquals(DateUtilTest.DATETIME_HOUR, DateUtil.format(calendar, DateFormats.DATETIME_HOUR));
		Assert.assertEquals(DateUtilTest.DATETIME_MINUTE, DateUtil.format(calendar, DateFormats.DATETIME_MINUTE));
		Assert.assertEquals(DateUtilTest.DATETIME_SECOND, DateUtil.format(calendar, DateFormats.DATETIME_SECOND));
		Assert.assertEquals(DateUtilTest.DATETIME_FRACTION, DateUtil.format(calendar, DateFormats.DATETIME_FRACTION));
		Assert.assertEquals(DateUtilTest.TIME_HOUR, DateUtil.format(calendar, DateFormats.TIME_HOUR));
		Assert.assertEquals(DateUtilTest.TIME_MINUTE, DateUtil.format(calendar, DateFormats.TIME_MINUTE));
		Assert.assertEquals(DateUtilTest.TIME_SECOND, DateUtil.format(calendar, DateFormats.TIME_SECOND));
		Assert.assertEquals(DateUtilTest.TIME_FRACTION, DateUtil.format(calendar, DateFormats.TIME_FRACTION));
	}

	@Test
	public void testParse() {
		Assert.assertNull(DateUtil.parse(null, DateFormats.DATE_DAY));
		Assert.assertNull(DateUtil.parse(DateUtilTest.DATETIME_FRACTION, null));

		Calendar calendar = this.generateCalendar();
		Date date = calendar.getTime();

		Assert.assertEquals(date, DateUtil.parse(DateUtilTest.DATETIME_FRACTION, DateFormats.DATETIME_FRACTION));
	}

	@Test
	public void testParseCalendar() {
		Assert.assertNull(DateUtil.parseCalendar(null, DateFormats.DATE_DAY));
		Assert.assertNull(DateUtil.parseCalendar(DateUtilTest.DATETIME_FRACTION, null));

		Calendar calendar = this.generateCalendar();

		Assert.assertEquals(calendar,
		        DateUtil.parseCalendar(DateUtilTest.DATETIME_FRACTION, DateFormats.DATETIME_FRACTION));
	}

	@Test
	public void testAdd() {
		Assert.assertNull(DateUtil.add((Date) null, Calendar.DAY_OF_MONTH, 1));
		Assert.assertNull(DateUtil.add((Calendar) null, Calendar.DAY_OF_MONTH, 1));

		Calendar calendar = this.generateCalendar();
		Date date = calendar.getTime();

		Assert.assertEquals(DateUtilTest.DATETIME_FRACTION_PLUS_MONTHS, DateUtil
		        .format(DateUtil.add(date, Calendar.MONTH, DateUtilTest.PLUS_MONTH), DateFormats.DATETIME_FRACTION));
		Assert.assertEquals(DateUtilTest.DATETIME_FRACTION_MINUS_MONTHS, DateUtil
		        .format(DateUtil.add(date, Calendar.MONTH, DateUtilTest.MINUS_MONTH), DateFormats.DATETIME_FRACTION));

		Assert.assertEquals(DateUtilTest.DATETIME_FRACTION_PLUS_MONTHS, DateUtil.format(
		        DateUtil.add(calendar, Calendar.MONTH, DateUtilTest.PLUS_MONTH), DateFormats.DATETIME_FRACTION));
		Assert.assertEquals(DateUtilTest.DATETIME_FRACTION_MINUS_MONTHS, DateUtil.format(
		        DateUtil.add(calendar, Calendar.MONTH, DateUtilTest.MINUS_MONTH), DateFormats.DATETIME_FRACTION));
	}

	/**
	 * Method which generates the calendar used for test
	 *
	 * @return The calendar
	 */
	private Calendar generateCalendar() {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, DateUtilTest.YEAR);
		calendar.set(Calendar.MONTH, DateUtilTest.MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, DateUtilTest.DAY);
		calendar.set(Calendar.HOUR_OF_DAY, DateUtilTest.HOUR);
		calendar.set(Calendar.MINUTE, DateUtilTest.MINUTE);
		calendar.set(Calendar.SECOND, DateUtilTest.SECOND);
		calendar.set(Calendar.MILLISECOND, DateUtilTest.FRACTION);
		return calendar;
	}
}