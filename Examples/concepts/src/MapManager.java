import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapManager
{
    public Set getKeys(HashMap map)
    {
        Set<Integer> n = new HashSet<>();
        n=map.keySet();
        return n;
//        Set<Map.Entry<Integer,String>> entry = map.entrySet();
//        entry
    }

    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Megha");
        map.put(2,"mayank");
        map.put(3,"virat");
        map.put(4,"ABD");

        MapManager m = new MapManager();
        System.out.println(m.getKeys(map));
    }
}
