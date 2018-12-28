package com.stackroute.unittest.pe4;

import java.util.*;

public class SortParagraphByWords {
    //public static void main(String args[]) {
        //Scanner sc =new Scanner(System.in);
        //String paragraph = sc.nextLine();

    public List<String > sortPara(String para)
    {
        List<String > listWords = new ArrayList<String>();

        String[] listOfWords = para.split(" ");
        for(int i=0;i<listOfWords.length;i++)
        {
            listWords.add(listOfWords[i]);
        }
        Collections.sort(listWords);
        System.out.println(listWords);
        return listWords;
    }
}