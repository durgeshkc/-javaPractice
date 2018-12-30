package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountOfWordsTest {

    CountOfWords countObject = new CountOfWords();
    @Test
    public void count() {
        String temp = "one one -one___two,,three,one @three*one?two";
        Map<String ,Integer> map = new HashMap<String, Integer>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        map.put("one",5);
        map.put("one",5);

        assertEquals(map,countObject.count(temp));
    }
//    @Test
//    public void countSecond() {
//        String temp = "This one is my favourite one which one do you like";
//        Map<String ,Integer> map2 = new HashMap<String, Integer>();
//        map2.put("This",1);
//        map2.put("one",3);
//        map2.put("is",1);
//        map2.put("my",1);
//        map2.put("favourite",1);
//        map2.put("which",1);
//        map2.put("do",1);
//        map2.put("you",1);
//        map2.put("like",1);
//
//        assertEquals(map2,countObject.count(temp));
//    }
}