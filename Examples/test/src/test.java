
import java.util.*;
public class test {
    public static void before()
    {
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
    public static void main(String a[])
    {
        test.before();
    }
}