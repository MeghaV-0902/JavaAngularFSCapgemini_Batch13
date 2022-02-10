class Calci4
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
class sciCali4 extends Calci4
{
    public void add(int a, int b)
    {
        System.out.println("Child class: "+(a+b));
    }
}

public class testOverriding
{
    public static void main(String[] args)
    {
        sciCali4 obj = new sciCali4();
        obj.add(5,10);
        Calci4 obj1 = new sciCali4();
        obj1.add(2,2);
    }
}
