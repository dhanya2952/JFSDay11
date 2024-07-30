package com.graymatter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CalculatorTest
{
	@Test
	public void testIsEven()
	{
		assertTrue(Calculator.isEven(44));
	}
	@Test
	public void testAdd()
	{
		assertEquals(5,Calculator.add(2, 3));
	}
	
	@Test
	public void testSub()
	{
		assertEquals(1,Calculator.sub(4, 3));
	}
	@Test
	public void testMul()
	{
		assertEquals(6,Calculator.mul(2, 3));
	}
	@Test
	public void testDiv()
	{
		assertEquals(2,Calculator.div(4, 2));
	}
	
	@Test
	@Category(MarkerInterface.class)
	public void testArrayEquals()
	{
		int expArray[]= {1,2,3,4,5};
		int actArray[]= {1,2,3,4,5};
		assertArrayEquals(expArray, Calculator.arrayEquals(actArray));
	}
	
	@Test
	@Category(MarkerInterface.class)
	public void testCheckString()
	{
		assertNull(Calculator.checkString());
	}
	
//	@Before
//	public void printLogBeforeMethod()
//	{
//		System.out.println("before test");
//	}
//	
//	@After
//	public void printLogAfterMethod()
//	{
//		System.out.println("After test");
//	}
//	
//	@BeforeClass
//	public static void beforeClassMethod()
//	{
//		System.out.println("before class");
//	}
//	
//	@AfterClass
//	public static void afterClassMethod()
//	{
//		System.out.println("after class");
//	}
	
	@Test
	public void testCreateStudent()
	{
		Student expStudent= new Student("dhanya",56,21);
		assertEquals(expStudent,Calculator.createStudent());
	}
	
//	static Connection con;
//	
//	@BeforeClass
//	public void testGetConnection() throws ClassNotFoundException, SQLException
//	{
//		DBConnection db = new DBConnection();
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/graymatterdb","root","password");
//		
//		assertEquals(con,db.getConnection());
//	}
//	
//	@Test
//	public void testConnection()
//	{
//		assertNotNull(con);
//	}

}
