package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrenceOfCharacterTest {

    CountOccurrenceOfCharacter count ;
    @Before
    public void setUp() throws Exception {
        CountOccurrenceOfCharacter count = new CountOccurrenceOfCharacter();
    }

    @After
    public void tearDown() throws Exception {
        CountOccurrenceOfCharacter count = null;
    }

    @Test
    public void difference() {
        assertEquals(2,count.difference(4,2));
        assertEquals(0,count.difference(2,2));
        assertEquals(0,count.difference(0,0));
        assertEquals(20,count.difference(40,20));
    }

    @Test
    public void differenceNotEquals() {
        assertNotEquals(5,count.difference(4,2));
        assertNotEquals(50,count.difference(30,2));
        assertNotEquals(5,count.difference(400,90));

    }

    @Test
    public void checkForNotNull() {
        //String s = null;
        assertNotNull("its not null",count.difference(6,7));
        assertNotNull("its not null",count.difference(0,0));

    }
}