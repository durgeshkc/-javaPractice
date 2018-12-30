package com.stackroute.unittest.pe5;

public class Student {
    private int id;
    private int age;
    private String name;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getId()
    {
        return id;
    }

    public String setName(String name)
    {
        this.name = name;
        return name;
    }

    public int setAge(int age)
    {
        this.age = age;
        return age;
    }

    public int setId(int id)
    {
        this.id = id;
        return id;
    }

    public String toString()
    {
        return this.id + " " + this.name +
                " " + this.age;
    }

}
