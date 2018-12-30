package com.stackroute.unittest.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
       int diff = o2.getAge() - o1.getAge();         //Printing in decreasing order of their id number.......
        if(diff==0)
        {
           int result = o1.getName().compareTo(o2.getName());
           if(result == 0)
           {
               int  finalResult  = o1.getId() - o2.getId();
               return finalResult;
           }
           else
               return result;
        }
        return diff;
    }


}
