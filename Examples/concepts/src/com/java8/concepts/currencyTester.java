package com.java8.concepts;
import java.io.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Currency;

public class currencyTester
{
    public static void main(String[] args) {
        Currency c1 = Currency.getInstance("INR");
        String s1 =  c1.getCurrencyCode();
        int cur = c1.getDefaultFractionDigits();
        String sym= c1.getSymbol();
        System.out.println(c1+" "+s1+" "+cur+" "+sym);
    }


 }
