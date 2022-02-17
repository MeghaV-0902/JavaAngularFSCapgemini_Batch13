package com.java8.concepts;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AgeCalculator
{
    public static int calculateAge(String date, String format)throws Exception
    {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate bday = LocalDate.parse(date,formatter);
        LocalDate now = LocalDate.now();
        //System.out.println(now);
        Period period = Period.between(bday,now);
        int age = period.getYears();
        return age;
    }

    public static void main(String[] args) throws Exception {
        String format="dd/MM/yyyy";
        int age = calculateAge("09/02/2001",format);
        System.out.println(age);
    }
}
