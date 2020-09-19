package com;

import org.testng.annotations.Test;

public class PriorityInTestNG {
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Priority 2");
	}
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Priority 1");
	}
	@Test(priority=0)
	public void test0()
	{
		System.out.println("Priority 0");
	}
	

}
