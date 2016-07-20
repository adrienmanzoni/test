package org.pequito.common.util;

import java.util.Collection;
import java.util.List;

/**
 * Class which makes the cast nicer in the calling class
 *
 * @author Adrien
 */
@SuppressWarnings("unchecked")
public final class CastUtil {

	/**
	 * Private constructor
	 */
	private CastUtil() {
		// Not accessible
	}

	/**
	 * Method which helps casting a typed list into another typed collection
	 *
	 * @param list
	 *            The collection to cast
	 * @return The casted collection
	 */
	public static <T, U extends T> Collection<T> cast(Collection<U> list) {
		return (Collection<T>) list;
	}

	/**
	 * Method which helps casting a typed list into another typed list
	 *
	 * @param list
	 *            The list to cast
	 * @return The casted list
	 */
	public static <T, U extends T> List<T> cast(List<U> list) {
		return (List<T>) list;
	}
}