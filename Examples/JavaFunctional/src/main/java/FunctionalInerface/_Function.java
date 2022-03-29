package FunctionalInerface;

import java.util.function.Function;

public class _Function
{
    public static void main(String[] args) {
        int inc = increment(0);
        System.out.println(inc);
        int inc2 = incrementByOne.apply(1);
        System.out.println(inc2);

        int mult = multiplyBy10.apply(inc2);
        System.out.println(mult);

        Function<Integer,Integer> newFunc=incrementByOne.andThen(multiplyBy10);
        int num =newFunc.apply(1);
        System.out.println(num);
    }
    static Function<Integer,Integer> incrementByOne = number -> number+1;
    static Function<Integer,Integer> multiplyBy10 = number->number*10;
    static int increment(int number)
    {
        return number+1;
    }

}
