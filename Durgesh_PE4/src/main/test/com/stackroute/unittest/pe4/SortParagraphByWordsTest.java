package com.stackroute.unittest.pe4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortParagraphByWordsTest {

    SortParagraphByWords sorting = new SortParagraphByWords();
    @Test
    public void sortPara() {

        List<String> para = new ArrayList<String>();

        para.add("Keshav");
        para.add("good");
        para.add("is");
        assertEquals(para,sorting.sortPara("Keshav is good"));

        List<String> para2 = new ArrayList<String>();

        para2.add("Durgesh");
        para2.add("good");
        para2.add("is");
        assertEquals(para2,sorting.sortPara("Durgesh is good"));


        List<String> para3 = new ArrayList<String>();

        para2.add("Durgesh");
        para2.add("good");
        para2.add("is");
        assertEquals(para2,sorting.sortPara("Durgesh is good"));
    }
}