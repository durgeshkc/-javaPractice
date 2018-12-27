package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelReplaceTest {

    VowelReplace vr;
    @Before
    public void setUp() throws Exception {
        VowelReplace vr = new VowelReplace();
    }

    @After
    public void tearDown() throws Exception {
        VowelReplace vr = null;
    }

    @Test
    public void replace() {
        String checkNull = null;
        assertEquals("dlh", vr.replace("delhi"));

        assertEquals("klkt", vr.replace("kolkata"));

        assertEquals("grgn", vr.replace("gurgaon"));

        assertNull(checkNull);
    }
}