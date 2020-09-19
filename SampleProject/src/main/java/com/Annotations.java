package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void test1() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void test2() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void test3() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void test4() {
		System.out.println("Before Method");
	}

	@Test
	public void test5() {
		System.out.println("Test5");
	}

	@Test
	public void test6() {
		System.out.println("Test6");
	}

	@AfterMethod
	public void test7() {
		System.out.println("After Method");
	}
	@AfterClass
	public void test8() {
		System.out.println("After Class");
	}

	@AfterTest
	public void test9() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void test10() {
		System.out.println("After Suite");
	}

}
