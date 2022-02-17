import java.util.Scanner;

class person1
{
    private int id;
    private String name;
    private int age;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


   //same name as ur class
   public person1(int id, String name, int age)
   {
       System.out.println("Inside parameterized contructor");
       this.id = id;
       this.name=name;
       this.age=age;
   }
}

public class basic
{
    public static void main(String args[])
    {
        //<class_name> <obj_name> = new <class_name>();
        person1 p1 = new person1(1,"raj",20);
       String nm=p1.getName();
        System.out.println(nm);
    }
}
