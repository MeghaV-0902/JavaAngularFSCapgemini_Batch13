class Calculator1
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
class ScientificCalculator extends Calculator1
{
    public void area(int a, int b)
    {
        System.out.println(a*b);
    }
}

public class TestInheritance
{

    public static void main(String args[])
    {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.add(12,20);
        scientificCalculator.area(4,5);
    }
}
