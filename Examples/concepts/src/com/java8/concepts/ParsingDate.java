package com.java8.concepts;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class ParsingDate
{
    public static void main(String[] args) {
        String date1="26-jul-2014";
        String dat2 = "26/07/2014";
        String date3 = "jul 26, 2014";

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date d;
        try
        {
            //System.out.println();
            d=sdf.parse(date1);
            System.out.println(d);
        }
        catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}

