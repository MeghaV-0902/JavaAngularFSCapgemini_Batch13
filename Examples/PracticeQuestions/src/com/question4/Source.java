package com.question4;

import java.util.ArrayList;

public class Source
{
    //CompanyJobRepository rep = new CompanyJobRepository();
    public String searchForJob(int age, String highestQualification) throws NotEligibleException
    {
        String message="Sorry we have no openings for now";
        if(age>=200 || age<=0)
        {
            throw new NotEligibleException("The age entered is not typical for a human being");
        }
        else
            message=CompanyJobRepository.getJobPrediction(age,highestQualification);

        return message;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new Source().searchForJob(20,"B.E"));
        }
        catch (NotEligibleException e)
        {
            e.printStackTrace();
        }
    }
}
class CompanyJobRepository
{
    public static String getJobPrediction(int age, String highestQualification)throws NotEligibleException
    {
        ArrayList<String> qual=new ArrayList<String>();
        qual.add("B.E");
        qual.add("M.S");
        qual.add("PhD");
        if(age>=26 && (highestQualification.equals("B.E")||highestQualification.equals("PhD")))
        {
            return "We have openings for senior developer";
        }
        else if(age>=21 && highestQualification.equals("B.E"))
        {

           return "We have openings for junior developer";
        }
        else if(age>=19 && (!qual.contains(highestQualification)))
        {
            System.out.println("here");
            System.out.println("B.E".equals(highestQualification));
           throw new NotEligibleException("We do not have any job that matches your qualifications");
        }
        else if (age<19)
        {
            throw new NotEligibleException("You are underage for any job");
        }
        else
            return "Sorry we have no openings for now";
    }

}
class NotEligibleException extends Exception
{
    NotEligibleException(String message)
    {
        super(message);
    }
}