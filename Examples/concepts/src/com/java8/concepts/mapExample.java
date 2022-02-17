package com.java8.concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mapExample
{
    public void HashMapMethod()
    {
        HashMap<Integer, String> map =  new HashMap<>();
        map.put(1,"Megha");
        map.put(2,"Akshay");
        map.put(3,"Shitty");

        Set <Map.Entry<Integer,String >> entry = map.entrySet();
        for(Map.Entry<Integer,String> e: entry)
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
