import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[] ints = getIntegers(5);
        int[] sorted = SortIntegers(ints);
        printArray(sorted);
    }
    public static int[] getIntegers(int num)
    {
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static int[] SortIntegers(int[] array)
    {
        //int[] sorted= new int[array.length];
        int[] sorted = Arrays.copyOf(array,array.length);
        for (int i = 0;i<array.length;i++)
        {
            sorted[i]=array[i];
        }
        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for(int i =0;i<sorted.length-1;i++)
            {
                if(sorted[i]<sorted[i+1])
                {
                    temp=sorted[i];
                    sorted[i]=sorted[i+1];
                    sorted[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }

}
