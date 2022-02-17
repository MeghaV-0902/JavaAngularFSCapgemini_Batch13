public class trials
{
    public static long toMilesPerHour(double KilometersPerHour)
    {
        int mph;
        if(KilometersPerHour<0)
        {
            return -1;
        }
        else{
            mph = (int)Math.round(KilometersPerHour / 1.6);
            return mph;
        }
    }
    public static void printConversion(double kilometersPerHour)
    {
        long mph;
        if(kilometersPerHour<0)
        {
            System.out.println("Inavlid input");
        }
        else {
            mph =toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }


    }
    public static void main(String[] args)
    {
        printConversion(95.7);
    }
}
