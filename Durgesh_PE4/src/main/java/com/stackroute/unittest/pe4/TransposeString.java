package com.stackroute.unittest.pe4;

import java.util.*;

public class TransposeString {
    public static String reverse(String str)
    {
        if(str == null)
            return null;
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            result+=str.charAt(i);
        }
        return result;
    }

//    public String getTranspose(String paragraph) {
//
//        System.out.println("helooooo");
//        List<String > listWords = new ArrayList<String>();
//        String para = paragraph;
//        String[] listOfWords = para.split(" ");
//        for(int i=0;i<listOfWords.length;i++)
//        {
//            String temp = listOfWords[i];
//
//            listWords.add(reverse(temp));
//        }
//        System.out.println(listWords);
//        return listWords.toString();
//    }

    public static void main(String args[])
    {
        //System.out.println("yf");
        //String paragraph = "a quick brown fox jumps over the lazy dog";
        //List<String > listWords = new ArrayList<String>();
        //String para = paragraph;
        String para = "a quick brown fox jumps over the lazy dog";

        String result = "";
        String[] listOfWords = para.split(" ");
        for(int i=0;i<listOfWords.length;i++)
        {
            String temp = listOfWords[i];

           // listWords.add(reverse(temp));
            result+=reverse(temp)+" ";
        }
        //System.out.println(listWords);
        //return listWords.toString();
       System.out.println(result);
    }
}
