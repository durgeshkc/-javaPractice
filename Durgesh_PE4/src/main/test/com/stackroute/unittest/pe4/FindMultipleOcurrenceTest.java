package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMultipleOcurrenceTest {

    FindMultipleOcurrence object  = new FindMultipleOcurrence();


    @Test
    public void checkSuccess() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found at:27-29";
        assertEquals(output,object.multipleOccurenceUsingMatcher(input,checkPattern));
    }
    @Test
    public void checkFailure() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found:27-29";
        assertNotSame(output,object.multipleOccurenceUsingMatcher(input,checkPattern));
    }
    @Test
    public void checkNotNull() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found at:27-29";
        assertNotNull(object.multipleOccurenceUsingMatcher(input,checkPattern));
    }
}