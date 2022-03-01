package com.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Source
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
        ArrayListOps a = new ArrayListOps();
        System.out.println(a.makeArrayListInt(4));
        System.out.println(a.reverseList(list));
        System.out.println(a.changeList(list,28,20));

    }
}

class ArrayListOps
{
    public ArrayList<Integer>  makeArrayListInt(int n)
    {
        int[] arr = new int[n];
        ArrayList<Integer> zeroArray= new ArrayList<Integer>(Collections.nCopies(n,0));
        System.out.println(zeroArray);
        return zeroArray;
    }

    public ArrayList<Integer> reverseList(ArrayList<Integer> list)
    {
        Collections.reverse(list);
        return  list;
    }

    public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
    {
        Collections.replaceAll(list,m,n);
        return list;
    }
}