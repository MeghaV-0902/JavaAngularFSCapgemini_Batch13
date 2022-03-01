package com.java8.concepts;

import java.util.Date;

public class DateClass
{
    public static void main(String[] args) {
        Date d1, d2, d3, d4,d5,d6;
        d1=new Date(2014,6,14);
        d2=new Date(2014,4,14);
        d3=new Date(2014,6,30);
        d4=new Date(2014,6,30);
        d5=new Date(2015,1,1);
        d6=new Date(2014,12,31);

        System.out.println("before "+d1.before(d2) );
        System.out.println("equals "+d3.equals(d4));
        System.out.println("after "+d5.after(d6));
        System.out.println("comapreTo "+d2.compareTo(d1));
        System.out.println("compareTo "+d5.compareTo(d6));
        System.out.println("gettime "+d5.getTime());
    }
}
