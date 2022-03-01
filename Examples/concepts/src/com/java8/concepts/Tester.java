package com.java8.concepts;
import javax.sound.midi.Soundbank;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class shutup {
    public static void main(String args[ ]) {
//        List<String> list=Arrays.asList("A","B","C","D","A","B");
//        Collections.sort(list,(s1,s2) -> s2.compareTo(s1) );
//        System.out.println(list);
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.stream().map(i -> "Number "+i).forEach( s -> System.out.println(s));

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.stream().map(i -> i * i).collect(Collectors.toList()).forEach( s -> System.out.println(s));
        System.out.println(list);
        Collection list2=new ArrayList();
        Collection set =new TreeSet();
        Object obj = new ArrayList();
        //Collection c1= new HashMap();

    }
}
public class Tester {

    public static void main(String[] args)
    {
        int firstArray[] = {99, 24};
        int secondArray[] = {99, 24};
        if (firstArray == secondArray)
            System.out.println("Same");
        else
            System.out.println("Not same"+firstArray.hashCode()+" "+secondArray.hashCode());
    }
}
interface X
{
    public void method1();
    public static void method2()
    {
        System.out.println("Method2");
    }
    public default void method3()
    {
        System.out.println("Method3");
    }
}
class Ximpl implements X
{
    @Override
    public void method1()
    {
        System.out.println("Method1");
    }
    public static void main(String[] args)
    {
        Ximpl x1 = new Ximpl();
        x1.method1();
        X.method2();
        x1.method3();
    }
}
class B implements Serializable
{
    int x = 100;//this ownt chnage without a constructor becuase its instance variable
    static int y = 200;//400 this chnages because all static variables are shared between objects. thus value changes even if there is no contructor initializing the value
    public static void main(String[] args) throws Exception
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1.sr"));
        B b1 = new B();
        oos.writeObject(b1);
        b1.x = 500;
        b1.y = 400;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1.sr"));
        B obj = (B) ois.readObject();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}

class Y {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void badMethod()
    {

    }
}
