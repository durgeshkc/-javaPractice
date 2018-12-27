package com.stackroute.unittest.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers {

    public static int getDifference(int a,int b)      //method to get the difference between pairs.......
    {
        int d = a-b;
        return d;
    }
    public static boolean checkForConsecutive(int f)
    {
        if(f==1)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] consecutiveList = new int[n];
        int [] temp = new int[n];
        System.out.println("ENter the sequence of numbers");
        for(int i=0;i<n;i++)
        {
            consecutiveList[i] = sc.nextInt();
            temp[i] = consecutiveList[i];
        }
        //Sorting the sequence in ascending order.........................
        Arrays.sort(consecutiveList);
        int flag =1;

        //Finding the difference between each pair of numbers from reverse...............
        for(int i=n-1;i>0;i--)
        {
            int d = getDifference(consecutiveList[i],consecutiveList[i-1]);
            if(d!=1)
            {
                flag=0;
                break;
            }
        }
        if(checkForConsecutive(flag))
            System.out.println("Consecutive");
        else
            System.out.println("Non consecutive");
    }
}
