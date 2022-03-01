public class MainClass
{
    public static void main(String[] args) {
        HamBurger hamBurger = new HamBurger("Basic","chicken",3.56,"white");
        hamBurger.addHamburgerAddition1("tomato",1);
        System.out.println("total : "+hamBurger.itemizeHamburger());
        healthyBurger healthy = new healthyBurger("chicken", 20);
        healthy.addHamburgerAddition1("toamto",2);
        System.out.println(healthy.itemizeHamburger());
        healthy.addHealthyAdd1("pro",2);
        System.out.println(healthy.itemizeHamburger());
        DeluxBurger db = new DeluxBurger();
        System.out.println(db.itemizeHamburger());

    }
}
