public class healthyBurger extends HamBurger
{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public healthyBurger(String meat, double price) {
        super("Healthy", meat, price, " Brown Rye");

    }
    public void addHealthyAdd1(String name, double price)
    {
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;
    }
    public void addHealthyAdd2(String name, double price)
    {
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name!=null)
        {
            hamburgPrice+=healthyExtra1Price;
            System.out.println("added healthy 1");
        }
        if(this.healthyExtra2Name!=null)
        {
            hamburgPrice+=healthyExtra2Price;
            System.out.println("added healthy 2");
        }
        return hamburgPrice;
    }
}
