package com.question3;

public class Source
{
    public String handleException(Activity a)
    {
        try
        {
            if(a.string1==null || a.string2==null)
            {
                //System.out.println("here");
                throw new NullPointerException("Null values found");
            }
            else if(a.operator.equals("+") || a.operator.equals("-"))
            {
                //System.out.println("here");
                return "No Exception Found";
            }
            else
            {
                throw new Exception();
            }
        }catch(NullPointerException n1)
        {
            //System.out.println("here");
            return "Null values found";
        }
        catch (Exception e)
        {
            return e.toString();
        }
    }
    public String doOperation(Activity a) {
        String exception = handleException(a);
        //System.out.println(exception);
        if (exception.equals("No Exception Found")) {
            switch (a.operator) {
                case "+":
                    return a.string1 + a.string2;
                case "-":
                    return a.string1.replace(a.string2, "");
            }
        }
        return exception;
    }

    public static void main(String[] args) {
        Activity a1 = new Activity("meghaearth ","megha","*");
        Source s = new Source();
        System.out.println(s.doOperation(a1));
    }
}
class Activity
{
    String string1;
    String string2;
    String operator;

    public Activity(String string1, String string2, String operator)
    {
        this.string1 = string1;
        this.string2 = string2;
        this.operator = operator;
    }


}