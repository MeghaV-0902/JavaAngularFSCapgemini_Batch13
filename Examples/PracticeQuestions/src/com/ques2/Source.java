package com.ques2;

import java.util.ArrayList;
import java.util.*;

public class Source
{
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        System.out.println(obj.addMobile("Oppo", "K3"));
        System.out.println(obj.getModels("Oppo"));
        System.out.println(obj.buyMobile("Oppo", "K3"));

    }
}

class Mobile
{
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
    public ArrayList<String> getModels(String company)
    {
        if(mobiles.keySet().contains(company) || !mobiles.get(company).isEmpty())
        {
            return mobiles.get(company);
        }
        return null;
    }

    public String addMobile(String company, String model)
    {
        Set<String> keys = mobiles.keySet();
        if(keys.contains(company))
        {
            ArrayList<String> arr = new ArrayList<>();
            arr= mobiles.get(company);
            arr.add(model);
            mobiles.put(company,arr);
        }
        else
        {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(model);
            mobiles.put(company,arr);
        }
        return "model successfully added";
    }

    public String buyMobile(String company, String model)
    {
       if(mobiles.keySet().contains(company) && mobiles.get(company).contains(model))
       {
           ArrayList<String> arr = new ArrayList<>();
           arr = mobiles.get(company);
           arr.remove(model);
           mobiles.replace(company,arr);
           return "mobile sold successfully";
       }
       return "item not available";
    }
}