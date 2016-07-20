package org.pequito.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Assert;
import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
		Collection<String> nullList = null;
		Assert.assertTrue(CollectionUtil.isEmpty(nullList));
		Map<String, String> nullMap = null;
		Assert.assertTrue(CollectionUtil.isEmpty(nullMap));

		Assert.assertTrue(CollectionUtil.isEmpty(new ArrayList<String>()));
		Assert.assertTrue(CollectionUtil.isEmpty(new LinkedList<String>()));
		Assert.assertTrue(CollectionUtil.isEmpty(new TreeSet<String>()));
		Assert.assertTrue(CollectionUtil.isEmpty(new ConcurrentLinkedQueue<String>()));
		Assert.assertTrue(CollectionUtil.isEmpty(new HashSet<String>()));
		Assert.assertTrue(CollectionUtil.isEmpty(new HashMap<String, String>()));
		Assert.assertTrue(CollectionUtil.isEmpty(new Hashtable<String, String>()));

		ArrayList<String> nonEmptyList = new ArrayList<>();
		nonEmptyList.add("1");
		Assert.assertFalse(CollectionUtil.isEmpty(nonEmptyList));
		HashMap<String, String> nonEmptyMap = new HashMap<>();
		nonEmptyMap.put("1", "2");
		Assert.assertFalse(CollectionUtil.isEmpty(nonEmptyMap));
	}
}