package com.java8.concepts;

public class StringClass1
{
    public static void main(String[] args) {
        StringBuilder first = new StringBuilder("Hello Megha");
        StringBuffer second = new StringBuffer(" this is String buffer");

        System.out.println(first.append(second));

        System.out.println(first.substring(6,10)+" "+second.substring(6,10));
        System.out.println(first.capacity()+" "+second.capacity());
        System.out.println(first.length()+" "+second.length());
    }
}
