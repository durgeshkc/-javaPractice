package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {

    public ArrayList<String> sortSet(Set<String> setOfStrings)
    {
        TreeSet myTreeSet = new TreeSet();      //Converting Set into TreeSet to sort it and remove any duplicates.........
        myTreeSet.addAll(setOfStrings);
        System.out.println(myTreeSet);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(myTreeSet);            //Converting treeset into arraylist using addAll...............
        System.out.println(arrayList);
        return arrayList;
    }
}
