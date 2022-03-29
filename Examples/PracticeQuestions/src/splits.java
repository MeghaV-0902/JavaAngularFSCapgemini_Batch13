import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class splits
{
    public static void main(String[] args) {
        String input="250,10@100,3@50,7";
        List<String> spilts1 = new ArrayList<>();
        spilts1= Arrays.asList(input.split("@"));
        System.out.println(spilts1);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(String i : spilts1)
        {
            List<String> j = new ArrayList<String>(Arrays.asList(i.split(",")));
            System.out.println(j);
            l1.add(Integer.parseInt(j.get(0)));
            l2.add(Integer.parseInt(j.get(1)));

        }
        System.out.println(l1+"\n"+l2);

        String name = "Daniel D'Cruz";
        boolean isvalid=Pattern.matches("([a-zA-z]+\\s[a-zA-z]+['-]*\\s*[a-zA-z]+)",name);
        System.out.println(isvalid);


    }
}
