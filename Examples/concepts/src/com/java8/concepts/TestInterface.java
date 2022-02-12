package com.java8.concepts;

interface myInterface
{
    void printMe();
}

interface mySeconfInterface
{
    void printHim();
}

class Student2 implements myInterface, mySeconfInterface
{

    @Override
    public void printMe() {
        System.out.println("hello print me");
    }

    @Override
    public void printHim() {
        System.out.println("Hello print him");
    }
}
public class TestInterface {
    public static void main (String args[])
    {
        Student2 student2 = new Student2();
        student2.printHim();
        student2.printMe();
    }
}
