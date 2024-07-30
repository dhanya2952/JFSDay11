package com.graymatter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
  
        Assertions.assertTrue( true );
    }
    
    @Test
    public void testAdd()
    {
    	assertEquals(3,App.add(1, 2));
    }
}
