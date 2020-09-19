package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void test() {
		Assert.assertTrue(true);
	}

	@Test
	public void test1() {
		Assert.assertTrue(false);
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("test", "test");
	}
	@Test
	public void test3()
	{
		Assert.assertEquals("test", "test");
	}
	@Test
	public void test4()
	{
		Assert.assertTrue(false, "not matching with the expected condition");
	}
	@Test
	public void test5()
	{
		Assert.assertFalse(false, "This is Expexted");
	}
	@Test
	public void test6()
	{
		Assert.assertNotEquals("test", "test1");
	}
	
}
