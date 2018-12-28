package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class ReplaceCharacter {

    public String replace(String input)
    {
        //Scanner sc = new Scanner(System.in);
        //String input1 = sc.nextLine();
        if(input ==null)
            return null;
        String result;
        result = input.replaceAll("d","f");
        result = result.replaceAll("l","t");
        System.out.println("result = "+ result);
        return result;
    }
}
