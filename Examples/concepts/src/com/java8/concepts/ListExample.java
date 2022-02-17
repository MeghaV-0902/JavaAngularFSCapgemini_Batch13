package com.java8.concepts;

import java.util.*;

public class ListExample
{
    void ArrayMethodList()
    {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Megha");
        list.add("Akshay");
        list.add("varsh");
        list.add("Maanasa");

        for( String s : list)
        {
            System.out.println(s);
        }
    }
    void LinkedMethodList()
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Megha");
        list.add("Akshay");
        list.add("varsh");
        list.add("Maanasa");

        for( String s : list)
        {
            System.out.println(s);
        }
    }
    public void Dequeuemethod()
    {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("megha");
        queue.add("akshay");
        queue.add("shitty");
        queue.addFirst("bhavishu");

        Iterator <String> itr = queue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public void hashSetMethod()
    {
        HashSet<String > set = new HashSet<>();
        set.add("Megha");
        set.add("Akshay");
        set.add("Megha");
        Iterator <String> itr = set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public void treeHashSetMethod()
    {
        TreeSet <String > set = new TreeSet<>();
        set.add("Megha");
        set.add("Akshay");
        set.add("Megha");
        Iterator <String> itr = set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args)
    {
        ListExample l = new ListExample();
        l.ArrayMethodList();
        l.LinkedMethodList();
        l.Dequeuemethod();
        l.hashSetMethod();
        l.treeHashSetMethod();
    }
}
