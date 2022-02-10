import java.util.Scanner;

public class CALCULATOR
{
    private int num1;
    private int num2;
    CALCULATOR(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public void AddNumbers()
    {
      int sum = this.num1+this.num2;
      System.out.println("Result of addition:"+sum);
    }
    public void SubtractNumbers()
    {
        int diff = this.num1-this.num2;
        System.out.println("Result of subtraction:"+diff);
    }
    public void MultiplyNumbers()
    {
        int product = this.num1*this.num2;
        System.out.println("Result of multiplication:"+product);
    }
    public void DivideNumbers()
    {
        double quo = (double)this.num1/this.num2;
        System.out.println("Result of division: "+quo);
    }
    public static void main(String args[])
    {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter first number: ");
     int num1= s.nextInt();
     System.out.println("Enter second number: ");
     int num2=s.nextInt();

     CALCULATOR calculator = new CALCULATOR(num1,num2);
     calculator.AddNumbers();
     calculator.SubtractNumbers();
     calculator.MultiplyNumbers();
     calculator.DivideNumbers();

    }
}
