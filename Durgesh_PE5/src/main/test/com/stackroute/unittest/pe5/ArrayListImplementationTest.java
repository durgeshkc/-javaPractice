package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListImplementationTest {

    ArrayListImplementation object ;

    @Before
    public void setUp() throws Exception {
        object = new ArrayListImplementation();
    }

    @After
    public void tearDown() throws Exception {
         object = null;
    }

    @Test
    public void arrayUpdate() {
        List<String > listItem = new ArrayList<String>();
        listItem.add("kiwi");
        listItem.add("Grape");
        listItem.add("Berry");
        listItem.add("Melon");

        assertEquals(listItem,object.arrayUpdate("Apple","kiwi"));
    }

    @Test
    public void arrayUpdateSecond() {
        List<String > listItem = new ArrayList<String>();
        listItem.add("Apple");
        listItem.add("Grape");
        listItem.add("Berry");
        listItem.add("Mango");

        assertEquals(listItem,object.arrayUpdate("Melon","Mango"));
    }

    @Test
    public void removeAll() {
        List<String > listItem = new ArrayList<String>();
        listItem.add("Apple");
        listItem.add("Grape");
        listItem.add("Berry");
        listItem.add("Mango");

        List<String > emptyList = new ArrayList<String>();
        assertEquals(emptyList,object.removeAllItems(listItem));

    }
    @Test
    public void removeListModified() {
        List<String> list = new ArrayList();

        List<String> list1 = new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon", "Berry"}));
        assertEquals(list, object.removeAllItems(list1));

        List<String> list2 = new ArrayList<String>(Arrays.asList(new String[]{"",""}));
        assertEquals(list,object.removeAllItems(list2));

        List<String> list3 = new ArrayList<String>(Arrays.asList(new String[]{"Apple"}));
        assertEquals(list,object.removeAllItems(list3));
    }
}