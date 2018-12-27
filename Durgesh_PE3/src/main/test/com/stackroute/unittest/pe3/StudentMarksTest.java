package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks sm ;
    @Before
    public void setUp() throws Exception {
        StudentMarks sm = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        StudentMarks sm = null;
    }


    @Test
    public void checkCondition() {
        assertTrue("Outside the range",sm.checkCondition(900));

        assertTrue("Outside the range",sm.checkCondition(180));

        assertFalse("Within the range",sm.checkCondition(99));

        assertFalse("Within the range",sm.checkCondition(1));

    }
}