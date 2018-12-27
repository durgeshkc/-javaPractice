package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers object;
    @Before
    public void setUp() throws Exception {
        ConsecutiveNumbers object = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        ConsecutiveNumbers object = null;
    }

    @Test
    public void checkForConsecutive() {
        assertTrue("Consecutive",object.checkForConsecutive(1));
        assertFalse("Given sequence is not consecutive",object.checkForConsecutive(0));
    }

    @Test
    public void getDifference()
    {
        assertEquals(1,object.getDifference(6,5));
        assertEquals(0,object.getDifference(9,9));
        assertEquals(2,object.getDifference(6,4));
        assertEquals(11,object.getDifference(6,-5));
        assertNotEquals(0,object.getDifference(6,5));

    }
    @Test
    public void getDifferenceOpposite()
    {
        assertEquals(-1,object.getDifference(6,7));
        assertEquals(-1,object.getDifference(9,10));
        assertNotEquals(-1,object.getDifference(9,12));

    }
}