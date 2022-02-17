package com.java8.concepts;

import java.util.ArrayList;

class Students implements Comparable<Students>
{
    private int id;
    private String name;
     Students()
     {

     }
    Students(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return this.getName();
    }


    @Override
    public int compareTo(Students o) {
        return this.getName().compareTo(o.getName());
    }
}

class SortId implements Comparable<Students>
{

    Students s = new Students();
    @Override
    public int compareTo(Students o) {
        if(s.getId()==o.getId())
            return 0;
        else if(s.getId()>o.getId())
            return 1;
        else
            return -1;

    }
}

class SortName implements Comparable<Students>
{

    Students s = new Students();
    @Override
    public int compareTo(Students o) {
        return s.getName().compareTo(o.getName());
    }
}

public class SortStudents
{
    public static void main(String args[])
    {
        Students student1= new Students(101, " Rajesh");
        Students student2 =  new Students(102,"Sam");
        Students student3 = new Students(103, "megha");
        Students student4 =  new Students(104, "Rahul");

        ArrayList<Students> MyStudents = new ArrayList<>();
        MyStudents.add(student1);
        MyStudents.add(student2);
        MyStudents.add(student3);
        MyStudents.add(student4);



    }


}
