package com.stackroute.unittest.pe5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfWords {


    public Map<String ,Integer> count(String input)
    {
        Map< String,Integer> hmap = new HashMap< String,Integer>();
        int result =0;
        String[] terms = input.split("[\\s@&.?$+-__,*=]+");
        for(int i=0;i<terms.length;i++)
        {
            if(hmap.get(terms[i])==null)
                hmap.put(terms[i],1);
            else
                hmap.put(terms[i],hmap.get(terms[i])+1)  ;
        }
        System.out.println(hmap);
        return hmap;
    }
}
