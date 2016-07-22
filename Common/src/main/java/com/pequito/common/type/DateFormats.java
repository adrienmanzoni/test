package com.pequito.common.type;

/**
 * Enumeration grouping the date formats
 *
 * @author Adrien
 */
public enum DateFormats {
	/** Date year */
	DATE_YEAR("yyyy"),
	/** Date month */
	DATE_MONTH("yyyy-MM"),
	/** Date day */
	DATE_DAY("yyyy-MM-dd"),
	/** Date time hour */
	DATETIME_HOUR("yyyy-MM-dd HH"),
	/** Date time minute */
	DATETIME_MINUTE("yyyy-MM-dd HH:mm"),
	/** Date time second */
	DATETIME_SECOND("yyyy-MM-dd HH:mm:ss"),
	/** Date time milliseconds */
	DATETIME_FRACTION("yyyy-MM-dd HH:mm:ss.SSS"),
	/** Time hour */
	TIME_HOUR("HH"),
	/** Time minute */
	TIME_MINUTE("HH:mm"),
	/** Time seconds */
	TIME_SECOND("HH:mm:ss"),
	/** Time milliseconds */
	TIME_FRACTION("HH:mm:ss.SSS");

	/** The format string */
	private final String formatString;

	/**
	 * Constructor
	 *
	 * @param formatString
	 *            The format string
	 */
	private DateFormats(String formatString) {
		this.formatString = formatString;
	}

	/**
	 * @return the formatString
	 */
	public String getFormatString() {
		return this.formatString;
	}
}