abstract class RBIloanCalculator
{
    abstract void emiCalculator(int rate);
}





class SBIBank extends RBIloanCalculator
{
    @Override
    void emiCalculator(int rate) {
        System.out.println("SBI calculation");
    }
}
class Icici extends RBIloanCalculator
{
    @Override
    void emiCalculator(int rate) {
        System.out.println("ICICI calculation");
    }
}
public class TestAbstraction
{
    public static void main(String args[])
    {
        SBIBank sbiBank = new SBIBank();
        sbiBank.emiCalculator(2);
    }
}
