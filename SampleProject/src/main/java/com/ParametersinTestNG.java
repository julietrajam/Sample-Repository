package com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersinTestNG {
	@Test
	@Parameters({"data","data1"})
	public void test1(@Optional("default") String data,@Optional("default1") String data1)
	{
		System.out.println(data);
		System.out.println(data1);
		
	}

}
