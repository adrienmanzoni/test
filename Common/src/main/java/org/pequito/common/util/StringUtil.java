package org.pequito.common.util;

/**
 * Class which provides helper on the String objects
 *
 * @author Adrien
 */
public final class StringUtil {

	/**
	 * Private constructor
	 */
	private StringUtil() {
		// Non accessible constructor
	}

	/**
	 * Method which check if the string is empty (null safe)
	 *
	 * @param string
	 *            The string
	 * @return Whether it is empty
	 */
	public static boolean isEmpty(String string) {
		return (string == null) || string.isEmpty();
	}

	/**
	 * Method which checks whether the strings are equals considering the case
	 * (null safe)
	 *
	 * @param string1
	 *            The 1st string
	 * @param string2
	 *            The 2nd string
	 * @return Whether the strings are equals
	 */
	public static boolean equals(String string1, String string2) {
		if (string1 != null) {
			return string1.equals(string2);
		} else {
			return string2 == null;
		}
	}

	/**
	 * Method which checks whether the strings are equals not considering the
	 * case (null safe)
	 *
	 * @param string1
	 *            The 1st string
	 * @param string2
	 *            The 2nd string
	 * @return Whether the strings are equals without case consideration
	 */
	public static boolean equalsIgnoreCase(String string1, String string2) {
		if (string1 != null) {
			return string1.equalsIgnoreCase(string2);
		} else {
			return string2 == null;
		}
	}

	/**
	 * Method which convert the string in lower case
	 *
	 * @param string
	 *            The string
	 * @return The lower case string
	 */
	public static String toLowerCase(String string) {
		if (string != null) {
			return string.toLowerCase();
		} else {
			return string;
		}
	}

	/**
	 * Method which convert the string in upper case
	 *
	 * @param string
	 *            The string
	 * @return The upper case string
	 */
	public static String toUpperCase(String string) {
		if (string != null) {
			return string.toUpperCase();
		} else {
			return string;
		}
	}

	/**
	 * Method which extract the substring of the given string starting a the
	 * given <b>beginIndex</b>
	 *
	 * @param string
	 *            The string
	 * @param beginIndex
	 *            The start index
	 * @return The substring
	 */
	public static String substring(String string, int beginIndex) {
		if (string != null) {
			if ((beginIndex >= 0) && (beginIndex < string.length())) {
				return string.substring(beginIndex);
			} else {
				return null;
			}
		} else {
			return string;
		}
	}

	/**
	 * Method which extract the substring of the given string starting a the
	 * given <b>beginIndex</b> and ending at the <b>endIndex</b>
	 *
	 * @param string
	 *            The string
	 * @param beginIndex
	 *            The start index
	 * @param endIndex
	 *            The end index
	 * @return The substring
	 */
	public static String substring(String string, int beginIndex, int endIndex) {
		if (string != null) {
			if ((beginIndex >= 0) && (beginIndex <= endIndex) && (endIndex < string.length())) {
				return string.substring(beginIndex, endIndex);
			} else {
				return null;
			}
		} else {
			return string;
		}
	}
}