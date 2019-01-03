package com.stackroute.unittest.pe5;

import java.util.Map;

public class MapModification {

    public Map<String,String> mapManipulation(Map<String,String> map)
    {
        if(map == null)
            return null;
        String str = map.get("val1");
        map.put("val1","");
        map.put("val2",str);
        return map;
    }
}
