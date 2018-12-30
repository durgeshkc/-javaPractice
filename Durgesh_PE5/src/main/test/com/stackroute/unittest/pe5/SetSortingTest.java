package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetSortingTest {

    SetSorting obj = new SetSorting();
    @Test
    public void sortSet() {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Harry");
        hash_Set.add("Olive");
        hash_Set.add("Alice");
        hash_Set.add("Bluto");
        hash_Set.add("Eugene");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Alice");
        arrayList.add("Bluto");
        arrayList.add("Eugene");
        arrayList.add("Harry");
        arrayList.add("Olive");

        assertEquals(arrayList,obj.sortSet(hash_Set));
    }
}