import java.util.Scanner;

public class GRADE_CALCULATOR
{
    int marks;
    GRADE_CALCULATOR(int m)
    {
        this.marks=m;
    }
    public String result()
    {
        if (this.marks>90&&this.marks<=100)
        {
            return "A";
        }
        else if(this.marks >80 && this.marks<=90)
        {
            return"B";
        }
        else if(this.marks >70 && this.marks<=80)
        {
            return"C";
        }
        else{
            return "Average";
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        GRADE_CALCULATOR t1 = new GRADE_CALCULATOR(marks);
        System.out.println(t1.result());
    }
}
