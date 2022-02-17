public class TestPolymorphism
{
    public void addition(int a, int b)
    {
        System.out.println(a+b);
    }
    public void addition(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public void addition(double a, double b)
    {
        System.out.println(a+b);
    }

    public static void main(String args[])
    {
        TestPolymorphism obj = new TestPolymorphism();
        obj.addition(2,3);
        obj.addition(1,2,3);
        obj.addition(1.5,3.5);
        obj.addition(1,1.5);

       // double abc =  (double)6/3;
    }
}
