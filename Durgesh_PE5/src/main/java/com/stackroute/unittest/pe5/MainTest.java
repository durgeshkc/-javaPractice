package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public static void main(String args[])
    {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student obj = new Student();
        obj.setId(121);
        obj.setAge(25);
        obj.setName("Michael");

        Student obj2 = new Student();
        obj2.setId(221);
        obj2.setAge(28);
        obj2.setName("Rheygar");

        Student obj3 = new Student();
        obj3.setId(101);
        obj3.setAge(35);
        obj3.setName("Denaerys");

        Student obj4 = new Student();
        obj4.setId(198);
        obj4.setAge(21);
        obj4.setName("Dracarys");

        Student obj5 = new Student();
        obj5.setId(421);
        obj5.setAge(35);
        obj5.setName("Simba");

        arrayList.add(obj);
        arrayList.add(obj2);
        arrayList.add(obj3);
        arrayList.add(obj4);
        arrayList.add(obj5);

        Collections.sort(arrayList,new StudentSorter());

        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

    }


}
