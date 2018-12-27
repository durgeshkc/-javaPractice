package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class VowelReplace {
    public static String replace(String str){

        return str.replaceAll("[aeiou]", "");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter number of places");
        int n = sc.nextInt();
        sc.nextLine();
        String [] places = new String[n];
        String [] placesWithoutVowel = new String[n];

        System.out.println("Please enter the list of places");
        for(int i=0;i<places.length;i++)
        {
            places[i] = sc.nextLine();
        }
        //Removing the vowels from every places and putting it in a different string::::::::::::
        for(int j=0;j<places.length;j++)
        {
            placesWithoutVowel[j] = replace(places[j]) ;
        }
        //Displaying the finally formed string of places..................................
        for(int j=0;j<places.length;j++)
        {
            System.out.println(placesWithoutVowel[j]);
        }
    }
}
