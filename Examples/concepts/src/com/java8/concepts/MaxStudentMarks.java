package com.java8.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxStudentMarks
{
    private int id;
    private String name;
    private int cmarks;
    private int pmarks;
    private int mmarks;

    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getCmarks()
    {
        return this.cmarks;
    }
    public void setCmarks(int cmarks)
    {
        this.cmarks=cmarks;
    }

    public int getPmarks()
    {
        return this.pmarks;
    }
    public void setPmarks(int pmarks)
    {
        this.pmarks=pmarks;
    }

    public int getMmarks()
    {
        return this.mmarks;
    }
    public void setMmarks(int mmarks)
    {
        this.mmarks=mmarks;
    }


    public int AverageOfStudent()
    {
        int sum = this.cmarks+this.mmarks+this.pmarks;
        int avg=sum/3;
        return avg;
    }
    public void DisplayMaxMarks(ArrayList<Integer> Avg, String[] name)
    {
        int maxMarks= Collections.max(Avg);
        int index=Avg.indexOf(maxMarks);
        String maxName= name[index];
//        for(int i =0; i <=3;i++)
//        {
//            System.out.println("Name: "+name[i]+"\nMarks: "+Avg.get(i));
//        }
        System.out.println("\nPerson who scored maximum marks is:");
        System.out.println("Name: "+maxName+"\nMax marks: "+maxMarks);
    }

    public static void main(String args[])
    {
        MaxStudentMarks m1 = new MaxStudentMarks();
        MaxStudentMarks m2 = new MaxStudentMarks();
        MaxStudentMarks m3 = new MaxStudentMarks();
        MaxStudentMarks m4 = new MaxStudentMarks();
        MaxStudentMarks m = new MaxStudentMarks();

        m1.setId(101);m1.setName("Raj");m1.setCmarks(45);m1.setPmarks(55);m1.setMmarks(67);
        m2.setId(102);m2.setName("Rajesh");m2.setCmarks(65);m2.setPmarks(85);m2.setMmarks(77);
        m3.setId(103);m3.setName("Suraj");m3.setCmarks(43);m3.setPmarks(55);m3.setMmarks(60);
        m4.setId(104);m4.setName("Tom");m4.setCmarks(71);m4.setPmarks(65);m4.setMmarks(70);

        List<Integer> Avg= new ArrayList<Integer>();
        String[] name = new String[4];

        Avg.add(m1.AverageOfStudent());
        name[0]=m1.getName();

        Avg.add(m2.AverageOfStudent());
        name[1]=m2.getName();

        Avg.add(m3.AverageOfStudent());
        name[2]=m3.getName();

        Avg.add(m4.AverageOfStudent());
        name[3]=m4.getName();

        m.DisplayMaxMarks((ArrayList<Integer>) Avg,name);

    }
}
