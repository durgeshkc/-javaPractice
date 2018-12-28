package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString obj;
    @Before
    public void setUp() throws Exception {
        TransposeString obj = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        TransposeString obj = null;
    }

    @Test
    public void reverse() {
        assertEquals("murd",obj.reverse("drum"));
        assertEquals("",obj.reverse(""));
        assertEquals("321",obj.reverse("123"));
        assertEquals("aloc",obj.reverse("cola"));
        assertNotEquals("ads",obj.reverse("abs"));
    }

    @Test
    public void checkForNotEquals() {
        assertNotEquals("ads",obj.reverse("abs"));
        assertNotEquals("abc",obj.reverse("abc"));
        assertNotEquals("durgesh",obj.reverse("kumar"));

    }

    @Test
    public void checkForNotNull() {
        //String s = null;
        assertNotNull("its not null",obj.reverse("dkkk"));
        assertNotNull("its not null",obj.reverse("abcdefg"));

    }

    @Test
    public void checkForNull() {
        String s = null;
        assertNull("its not null",obj.reverse(s));

    }
}