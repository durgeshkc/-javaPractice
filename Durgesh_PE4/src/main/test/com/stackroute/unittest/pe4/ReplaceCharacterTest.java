package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter object  = new ReplaceCharacter() ;
//    @Before
//    public void setUp() throws Exception {
//        ReplaceCharacter oject = new ReplaceCharacter();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        ReplaceCharacter object = null;
//    }

    @Test
    public void replace() {
        assertEquals("faity fry",object.replace("daily dry"));
        assertEquals("frum",object.replace("drum"));
        assertEquals("faity tong",object.replace("daily long"));
        assertEquals("fairy tack",object.replace("dairy lack"));
    }
    @Test
    public void CheckNotEqual() {
        assertNotEquals("faily fry",object.replace("daily dry"));
        assertNotEquals("trum",object.replace("drum"));
    }
    @Test
    public void checkForNull() {
        String s =null;
        assertNull("its null",s);
        assertNotNull("Its not null","string");
    }

}