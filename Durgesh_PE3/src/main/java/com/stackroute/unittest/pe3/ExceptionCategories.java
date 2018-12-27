package com.stackroute.unittest.pe3;

public class ExceptionCategories {
    public static void main(String args[])
    {
        //;;;;;;;;;;;;;;;;;;;;;;;;;ArrayIndexOutOfBoundsException;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        int marks[] = {  40, 50, 60 };

        try
        {
            System.out.println(marks[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        //;;;;;;;;;;;;;;;;;;;;;;;;NullPointerException;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

        String str=null;

        try{
            if(str.equals("Durgesh"))
                System.out.println("Durgesh");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException Caught " + e);
        }

        //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;NegativeArraySizeException;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        int arrSize = -8;
        try {
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException ex)
        {
            System.out.println("Error! Size of array is negative" + ex);
        }
    }
}
