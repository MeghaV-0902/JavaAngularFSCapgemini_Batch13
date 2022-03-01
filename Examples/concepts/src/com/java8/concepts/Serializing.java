package com.java8.concepts;

import java.io.*;

public class Serializing implements Serializable
{
    public static void main(String[] args) throws IOException {
        try
        {
            Country c1 = new Country("India",123456789);
            FileOutputStream fout = new FileOutputStream("country.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(c1);
            obj.flush();
            obj.close();
        }
        catch(Exception e)
        {

        }

    }

}
class Country implements Serializable
{
    String name;
    long population;


    public Country() {
        super();
    }
    public Country(String name, long population) {
        super();
        this.name = name;
        this.population = population;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
}

class Deserialing
{
    public static void main(String[] args) throws ClassNotFoundException {
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("country.txt"));
            Country c1 = (Country)in.readObject();
            System.out.println(c1.name+" " +c1.population);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Deserializedemo {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("country.txt"));
            Country c1=(Country) in.readObject();
            System.out.println(c1.name + c1.population);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}


