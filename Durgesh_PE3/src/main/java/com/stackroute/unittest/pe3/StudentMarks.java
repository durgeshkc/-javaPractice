package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class StudentMarks {

    public static boolean checkCondition(int n)     //Method to check for the limits:::::::::::::::::
    {
        if(n<0 || n>100)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner((System.in));
        int numOfStudents = sc.nextInt();
        int [] stuGrades = new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            int temp=sc.nextInt();

            if(checkCondition(temp))
            {
                System.out.println("Error! Out of Range..Please re-enter your grade");
                temp = sc.nextInt();
                while (checkCondition(temp))
                {
                    System.out.println("Error! Out of Range..Please re-enter your grade");
                    temp = sc.nextInt();
                }
                stuGrades[i]=temp;
            }
            else
                stuGrades[i]=temp;
        }
        //Displaying the final grades.....::::::::::::::::::::::::::::::::::::::
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.println(stuGrades[i]);
        }
    }
}
