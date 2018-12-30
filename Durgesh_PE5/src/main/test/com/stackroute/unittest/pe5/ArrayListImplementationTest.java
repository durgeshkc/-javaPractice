package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListImplementationTest {

    ArrayListImplementation object = new ArrayListImplementation();
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
}