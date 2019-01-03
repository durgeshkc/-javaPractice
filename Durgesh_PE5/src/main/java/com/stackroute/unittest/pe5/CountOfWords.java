package com.stackroute.unittest.pe5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfWords {


    public Map<String ,Integer> count(String input)
    {
        if(input==null)
            return null;

        if(input.length()==0)
            return null;
        Map< String,Integer> hmap = new HashMap< String,Integer>();
        int result =0;
        String[] terms = input.split("[^a-zA-Z]");
//        for(String t : terms)
//            if(t.equals(""))
//                System.out.println("NULL");

        for(int i=0;i<terms.length;i++)
        {
            if(terms[i].equals(""))         //for two consecutive spaces/delimiters in a strings,there is a null character in between them which is also counted as an empty string.
                continue;
            if(hmap.get(terms[i])==null)
                hmap.put(terms[i],1);
            else
                hmap.put(terms[i],hmap.get(terms[i])+1)  ;
        }
        System.out.println(hmap);
        return hmap;
    }
}
