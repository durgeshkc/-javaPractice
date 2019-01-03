package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetSortingTest {

    SetSorting obj ;

    @Before
    public void setUp() throws Exception {
        obj = new SetSorting();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void sortSet() {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Harry");
        hash_Set.add("Olive");
        hash_Set.add("Alice");
        hash_Set.add("Bluto");
        hash_Set.add("Eugene");

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Alice");
        arrayList.add("Bluto");
        arrayList.add("Eugene");
        arrayList.add("Harry");
        arrayList.add("Olive");

        assertEquals(arrayList,obj.sortSet(hash_Set));


        Set<String> hash_Set2 = new HashSet<String>();
        hash_Set2.add("mango");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("mango");

        assertEquals(arrayList2,obj.sortSet(hash_Set2));
    }

    @Test
    public void sortEmptySet() {

        Set<String> hash_Set = new HashSet<String>();

        assertNull(obj.sortSet(hash_Set));

    }
    @Test
    public void sortNullSet() {
        Set<String> hash_Set2 = null;
        assertNull(obj.sortSet(hash_Set2));
    }
}