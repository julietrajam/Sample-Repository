package com;

import org.testng.annotations.Test;

public class GroupingInTestNG {
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("Sanity Test");
	}
	@Test(groups= {"sanity","regression"})
	public void test2()
	{
		System.out.println("Sanity and Regression Test");
	}
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("Regression Test");
	}

}
