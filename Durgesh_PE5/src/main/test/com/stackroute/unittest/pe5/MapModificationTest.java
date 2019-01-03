package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModificationTest {

    MapModification obj ;

    @Before
    public void setUp() throws Exception {
        obj = new MapModification();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void mapManipulation() {

        Map<String, String> hmap1 = new HashMap();
        hmap1.put("val1","java");
        hmap1.put("val2","c++");
        Map<String, String> hmap2 = new HashMap();
        hmap2.put("val1","");
        hmap2.put("val2","java");
        assertEquals(hmap2,obj.mapManipulation(hmap1));

        Map<String, String> hmap3 = new HashMap();
        hmap3.put("val1","python");
        hmap3.put("val2","c++");
        Map<String, String> hmap4 = new HashMap();
        hmap4.put("val1","");
        hmap4.put("val2","java");
        assertNotEquals(hmap4,obj.mapManipulation(hmap3));

    }
}