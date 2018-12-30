package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Map;

public class StringArrayHashMap
{
    public Map<String,Boolean> findOcurrrence(String [] str){
        Map< String,Boolean> hmap = new HashMap< String,Boolean>();
        Map< String,Integer> temp = new HashMap< String,Integer>();
        for(int i=0;i<str.length;i++){
            if(temp.get(str[i])==null)
                temp.put(str[i],1);
            else
                temp.put(str[i],temp.get(str[i])+1);
        }
        //will have to use for each loop to iterate over map as map is not a collection we will use MAp.Entry() interface
        for(Map.Entry<String,Integer> itr :temp.entrySet())
        {
            if(itr.getValue()>=2)
            {
                hmap.put(itr.getKey(),true);
            }
            else
            {
                hmap.put(itr.getKey(),false);
            }
        }
        System.out.println(hmap);
        return hmap;
    }
}
