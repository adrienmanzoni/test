package org.pequito.common.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testIsEmpty() {
		Assert.assertTrue(StringUtil.isEmpty(null));
		Assert.assertTrue(StringUtil.isEmpty(""));
		Assert.assertFalse(StringUtil.isEmpty("1"));
	}

	@Test
	public void testEquals() {
		Assert.assertTrue(StringUtil.equals(null, null));
		Assert.assertTrue(StringUtil.equals("", ""));
		Assert.assertTrue(StringUtil.equals("1", "1"));
		Assert.assertFalse(StringUtil.equals(null, ""));
		Assert.assertFalse(StringUtil.equals("", null));
		Assert.assertFalse(StringUtil.equals("1", "2"));
		Assert.assertFalse(StringUtil.equals("abc", "ABC"));
	}

	@Test
	public void testEqualsIgnoreCase() {
		Assert.assertTrue(StringUtil.equalsIgnoreCase(null, null));
		Assert.assertTrue(StringUtil.equalsIgnoreCase("", ""));
		Assert.assertTrue(StringUtil.equalsIgnoreCase("1", "1"));
		Assert.assertTrue(StringUtil.equalsIgnoreCase("abc", "ABC"));
		Assert.assertFalse(StringUtil.equalsIgnoreCase(null, ""));
		Assert.assertFalse(StringUtil.equalsIgnoreCase("", null));
		Assert.assertFalse(StringUtil.equalsIgnoreCase("1", "2"));
	}

	@Test
	public void testToLowerCase() {
		Assert.assertEquals(null, StringUtil.toLowerCase(null));
		Assert.assertEquals("", StringUtil.toLowerCase(""));
		Assert.assertEquals("1", StringUtil.toLowerCase("1"));
		Assert.assertEquals("abc", StringUtil.toLowerCase("abc"));
		Assert.assertEquals("abc", StringUtil.toLowerCase("ABC"));
	}

	@Test
	public void toUpperCase() {
		Assert.assertEquals(null, StringUtil.toUpperCase(null));
		Assert.assertEquals("", StringUtil.toUpperCase(""));
		Assert.assertEquals("1", StringUtil.toUpperCase("1"));
		Assert.assertEquals("ABC", StringUtil.toUpperCase("abc"));
		Assert.assertEquals("ABC", StringUtil.toUpperCase("ABC"));
	}

	@Test
	public void testSubstring() {
		Assert.assertEquals(null, StringUtil.substring(null, 1));
		Assert.assertEquals(null, StringUtil.substring("", 1));
		Assert.assertEquals(null, StringUtil.substring("", 2));
		Assert.assertEquals("cdefghi", StringUtil.substring("abcdefghi", 2));
		Assert.assertEquals(null, StringUtil.substring("abcdefghi", -1));
		Assert.assertEquals("bcdefg", StringUtil.substring("abcdefghi", 1, 7));
		Assert.assertEquals(null, StringUtil.substring("abcdefghi", -1, 4));
		Assert.assertEquals(null, StringUtil.substring("abcdefghi", 1, 10));
	}
}