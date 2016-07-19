package org.pequito.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CastUtilTest {
	private static final int NUM_ITEMS = 10;

	@Test
	public void testCastCollection() {
		try {
			Collection<String> listString = generateCollection(String.class);
			Collection<Object> listObj = CastUtil.cast(listString);
			
			Assert.assertNotNull(listObj);
			Assert.assertEquals(NUM_ITEMS, listObj.size());
			Iterator<String> its = listString.iterator();
			Iterator<Object> ito = listObj.iterator();
			while(its.hasNext()) {
				Assert.assertEquals(its.next(), ito.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void testCastList() {
		try {
			List<String> listString = generateList(String.class);
			List<Object> listObj = CastUtil.cast(listString);
			
			Assert.assertNotNull(listObj);
			Assert.assertEquals(NUM_ITEMS, listObj.size());
			for (int i = 0; i < NUM_ITEMS; i++) {
				Assert.assertEquals(listString.get(i), listObj.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	private static <T> Collection<T> generateCollection(Class<T> clazz) throws Exception {
		Collection<T> result = new ArrayList<>();
		for (int i = 0; i < NUM_ITEMS; i++) {
			result.add(clazz.newInstance());
		}
		return result;
	}
	
	private static <T> List<T> generateList(Class<T> clazz) throws Exception {
		List<T> result = new ArrayList<>();
		for (int i = 0; i < NUM_ITEMS; i++) {
			result.add(clazz.newInstance());
		}
		return result;
	}
}