package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatching {
//    public static void main(String args[]) {
//        Scanner sc =new Scanner(System.in);
//        String input = sc.nextLine();
//        //String wordToFind = sc.next();
//        boolean result ;
//
//        String patternString = ".*Harry.*";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(input);
//        result = matcher.matches();
//
//        if (result) {
//            System.out.println("True");
//        } else
//            System.out.println("false");
//    }

    public boolean matching(String input,String word)
    {
        boolean result ;

        String patternString = ".*Harry.*";
        if(input == null)
            return false;
        //String patternString =word;
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        result = matcher.matches();

        if (result) {
            //System.out.println("True");
            return true;
        } else
           // System.out.println("false");
        return false;
    }
}
