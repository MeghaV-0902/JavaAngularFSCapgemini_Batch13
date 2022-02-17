public class SimpleCalculator
{
    private double firstNum;
    private double secondNum;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
    public double addNumbers()
    {
        double sum;
        sum=this.firstNum+this.secondNum;
        return sum;
    }
    public double subtractNumbers()
    {
        double diff;
        diff=this.firstNum-this.secondNum;
        return diff;
    }
    public double MultiplyNumbers()
    {
        double prod;
        prod=this.firstNum*this.secondNum;
        return prod;
    }
    public double divNumbers()
    {
        double quo;
        if(this.secondNum==0)
            return 0.0;
        quo=this.firstNum/this.secondNum;
        return quo;
    }
    public static void main(String args[])
    {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNum(5.0);
        calculator.setSecondNum(4);
        System.out.println("add= " + calculator.addNumbers());
        System.out.println("subtract= " + calculator.subtractNumbers());
        calculator.setFirstNum(5.25);
        calculator.setSecondNum(0);
        System.out.println("multiply= " + calculator.MultiplyNumbers());
        System.out.println("divide= " + calculator.divNumbers());

    }
}
