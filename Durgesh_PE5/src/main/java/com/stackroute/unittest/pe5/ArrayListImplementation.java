package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {


    public List<String> arrayUpdate(String toRemove,String newElement)
    {
        List<String > list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Berry");
        list.add("Melon");
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i).equals(toRemove))
            {
                list.set(i,newElement);
            }
        }
        System.out.println(list);
        return list;
    }

    public List<String> removeAllItems(List<String> list)
    {
        if(list==null)
            return null;
        //System.out.println(list.size());
         list.removeAll(list);
         //System.out.println(list);
         return list;
    }
}
