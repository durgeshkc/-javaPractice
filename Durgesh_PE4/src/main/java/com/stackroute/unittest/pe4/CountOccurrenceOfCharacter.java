package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class CountOccurrenceOfCharacter {

    public static int difference (int a ,int b){
        return (a-b);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int flag=0;
        String ch = sc.next();
        int lengthOfAll = input.length();
        if(input.contains(ch))
            flag = 1;
        int lengthWithoutCharacter = input.replaceAll(ch,"").length();
        int result;
        if(flag==1)
            result = difference(lengthOfAll ,lengthWithoutCharacter);
        else
            result = 0;
        System.out.println("result = " + result);
    }

}
