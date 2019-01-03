package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayHashMapTest {

    StringArrayHashMap object ;

    @Before
    public void setUp() throws Exception {
        object = new StringArrayHashMap();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void findOcurrrence() {
        String[] str =  {"a","b","c","d","a","c","c"};
        Map<String ,Boolean> output = new HashMap<String, Boolean>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);
        assertEquals(output,object.findOcurrrence(str));
    }

    @Test
    public void findOcurrrenceMore() {
        String[] str =  {"abc","bde","cfg","abc","def","ghi","bde"};
        Map<String ,Boolean> output = new HashMap<String, Boolean>();
        output.put("abc",true);
        output.put("bde",true);
        output.put("cfg",false);
        output.put("ghi",false);
        output.put("def",false);
        assertEquals(output,object.findOcurrrence(str));
    }
    @Test
    public void findOcurrrenceMoreNotEquals() {
        String[] str =  {"abc","bde","cfg","abc","def","ghi","bde"};
        Map<String ,Boolean> output = new HashMap<String, Boolean>();
        output.put("abc",true);
        output.put("bde",false);
        output.put("cfg",false);
        output.put("ghi",false);
        output.put("def",false);
        assertNotEquals(output,object.findOcurrrence(str));
    }

    @Test
    public void findOcurrrenceNotEquals() {
        String[] str =  {"a","b","c","d","a","c","c"};
        Map<String ,Boolean> output = new HashMap<String, Boolean>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",false);
        output.put("d",false);
        assertNotEquals(output,object.findOcurrrence(str));
    }
}