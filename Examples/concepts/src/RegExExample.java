import java.util.regex.*;
public class RegExExample
{
    public static void main(String[] args)
    {
       Pattern p = Pattern.compile("al");
       Matcher m = p.matcher("also");
        System.out.println(m.find());
        System.out.println(Pattern.matches("abcde*f","abcdef"));
        Pattern pat = Pattern.compile(".com");
        Matcher m1 = pat.matcher("meghavasu9@gmail.com");

        while(m1.find())
        {
            System.out.println(m1.start());
            System.out.println(m1.end()-1);
        }

    }
}
