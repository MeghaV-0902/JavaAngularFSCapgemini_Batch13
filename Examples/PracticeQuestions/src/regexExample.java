public class regexExample
{
    public static void main(String[] args) {
        System.out.println("harry".replaceAll("[Hh]arry","Harry"));
        String alphamumeric="abcDeF12Ghhiiiijaaak99555z";
        System.out.println(alphamumeric.replaceAll("[^ej]","x"));
        //^inside square brackets become charachter class ^outside [] becoes boundary matcher
        System.out.println(alphamumeric.replaceAll("[a-f3-8]","X"));
        System.out.println(alphamumeric.replaceAll("^abcDeee","YYY"));
        String third = "abcDeeeF12Ghhiiiijaaak99z";
        System.out.println(alphamumeric.replaceAll("^abcDe{3}","YYY"));
        System.out.println(alphamumeric.replaceAll("^abcDe+}","YYY"));
        System.out.println(alphamumeric.replaceAll("^abcDe*","YYY"));

    }
}
