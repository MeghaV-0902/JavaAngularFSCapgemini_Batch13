public class HamBurger
{
    private String name;
    private String meat;
    private double price=0;
    private String breadRollType;

    private String addition1name;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;

    public HamBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1(String name, double price)
    {
        this.addition1name=name;
        this.addition1price=price;
    }
    public void addHamburgerAddition2(String name, double price)
    {
        this.addition2name=name;
        this.addition2price=price;
    }
    public void addHamburgerAddition3(String name, double price)
    {
        this.addition3name=name;
        this.addition3price=price;
    }
    public void addHamburgerAddition4(String name, double price)
    {
        this.addition4name=name;
        this.addition4price=price;
    }
    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price;
        //System.out.println(hamburgerPrice+this.addition1price);
        System.out.println(this.name+" "+this.breadRollType+" "+this.price+" "+hamburgerPrice);
        if(this.addition1name!=null)
        {
            hamburgerPrice+=this.addition1price;
            System.out.println(this.addition1name+" "+this.addition1price);
        }
        if(this.addition2name!=null)
        {
            hamburgerPrice+=this.addition2price;
            System.out.println(this.addition2name+" "+this.addition2price);
        }
        if(this.addition3name!=null)
        {
            hamburgerPrice+=this.addition3price;
            System.out.println(this.addition3name+" "+this.addition3price);
        }
        if(this.addition4name!=null)
        {
            hamburgerPrice+=this.addition4price;
            System.out.println(this.addition4name+" "+this.addition4price);
        }
        return hamburgerPrice;
    }
}
