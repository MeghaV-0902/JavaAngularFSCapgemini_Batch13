package com.java8.concepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;


public class ListManager
{
    public ArrayList<String> removeElements(ArrayList<String> list1, ArrayList<String> list2)
    {
//        Set<String> set1 = new HashSet<>(list1);
//        Set<String> set2 =  new HashSet<>(list2);
        //Set<String> newSet = new HashSet<>();
//        set1.retainAll(set2);

        list1.retainAll(list2);

        return list1;
    }

    public ArrayList<String> getArrayList(String []elements)
    {
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(elements));
        return newList;
    }
    public static void main(String[] args) {
        ListManager l1 = new ListManager();
//        ArrayList<String> list1= new ArrayList<>();
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        list1.add("4");
//        list1.add("5");
//
//        ArrayList<String> list2= new ArrayList<>();
//        list2.add("2");
//        list2.add("3");
//        list2.add("4");
//
//        System.out.println( l1.removeElements(list1,list2));
        String[] elements={"Megha","Akshay","Harshit"};
        System.out.println(l1.getArrayList(elements));
    }
}
