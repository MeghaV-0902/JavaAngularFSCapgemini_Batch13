import java.util.ArrayList;
import java.util.*;

public class java8Demo1
{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        values.forEach(System.out::println);
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
    }
}
