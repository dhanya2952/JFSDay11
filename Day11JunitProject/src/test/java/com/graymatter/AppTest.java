package com.graymatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
	@Test
	public void testPrintName()
	{
		assertEquals("dhanya",App.printName("dhanya"));
	}
	
	//if we execute any one phase then all the previous phases will also be executed
}
