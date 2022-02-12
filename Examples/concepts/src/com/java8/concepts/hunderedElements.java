package com.java8.concepts;

public class hunderedElements
{
    public static int[] define100Arrays()
    {
        int[] array = new int[100];
        for(int i = 0; i<100;i++)
        {
            array[i]=i;
        }
        return array;
    }
    public static void main(String args[])
    {
        int[] array = define100Arrays();
        for(int i =0;i <100; i++)
        {
            System.out.println(array[i]);
        }
    }
}
