package com.graymatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoTest {
	@Test
	public void testPrintName()
	{
		assertEquals("dhanya",DemoClass.printName());
	}
	@BeforeEach
	public void printLogBeforeMethod()
	{
		System.out.println("before test");
	}
	
	@AfterEach
	public void printLogAfterMethod()
	{
		System.out.println("After test");
	}
	
	@BeforeAll
	public static void beforeClassMethod()
	{
		System.out.println("before class");
	}
	
	@AfterAll
	public static void afterClassMethod()
	{
		System.out.println("after class");
	}

}
