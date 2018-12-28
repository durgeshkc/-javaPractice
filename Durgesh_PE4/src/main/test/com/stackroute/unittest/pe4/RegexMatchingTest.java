package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatchingTest {

    RegexMatching match = new RegexMatching();
    @Test
    public void matching() {
        assertTrue("true",match.matching("This is Harry","Harry"));
        assertTrue("true",match.matching("This is Harry from Us ","Harry"));
        assertTrue("true",match.matching("This is Harry from Indiana","Harry"));
    }

    @Test
    public void checkForNotNull() {
        String s = null;
        assertNotNull("its not null",match.matching("its Harry","Harry"));
        //assertNull("its  null",match.matching(s,"Harry"));


    }
}