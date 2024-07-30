package com.graymatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest 
{
	HelloClass hc = new HelloClass();
	@Test
	public void testSayHello()
	{
		String expected ="Hello...";
		//HelloClass hc = new HelloClass();
		String actual= hc.sayHello();
		
		assertEquals(expected, actual);
		
	}
	
	public void testAdd()
	{
		
		assertEquals(5, hc.add(2, 3));
	}

}
