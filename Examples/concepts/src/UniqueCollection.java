import java.util.List;
import java.util.*;

public class UniqueCollection
{
    public TreeSet<String> getCollection(String[] elements)
    {

        List<String> pass = new ArrayList<String>(Arrays.asList(elements));
        TreeSet<String> newSet= new TreeSet<>(pass);
        return newSet;

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n  = s.nextInt();
        String[] elements=new String[n];

        for(int i =0; i<n;i++)
        {
            elements[i]=s.next();
        }
        UniqueCollection u = new UniqueCollection();
        System.out.println(u.getCollection(elements));
    }
}
