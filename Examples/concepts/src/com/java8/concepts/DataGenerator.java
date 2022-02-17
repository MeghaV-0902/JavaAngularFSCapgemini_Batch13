package com.java8.concepts;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataGenerator
{
    public String generateDate(String format)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate current = LocalDate.now();
        String newdate=formatter.format(current);
        return newdate;
    }

    public static void main(String[] args)
    {
        DataGenerator d = new DataGenerator();
        System.out.println(d.generateDate("dd/MM/YYYY"));
    }


}
