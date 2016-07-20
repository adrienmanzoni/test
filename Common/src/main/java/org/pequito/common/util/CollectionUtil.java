package org.pequito.common.util;

import java.util.Collection;
import java.util.Map;

/**
 * Class which provides helper on the Collection/List/Set/Queue/Map objects
 *
 * @author Adrien
 */
public final class CollectionUtil {

	/**
	 * Private constructor
	 */
	private CollectionUtil() {
		// Not accessible
	}

	/**
	 * Method which check if the list is empty (null safe)
	 *
	 * @param list
	 *            The list
	 * @return Whether it is empty
	 */
	public static <E> boolean isEmpty(Collection<E> list) {
		return (list == null) || list.isEmpty();
	}

	/**
	 * Method which check if the map is empty (null safe)
	 *
	 * @param map
	 *            The map
	 * @return Whether it is empty
	 */
	public static <E, V> boolean isEmpty(Map<E, V> map) {
		return (map == null) || map.isEmpty();
	}
}