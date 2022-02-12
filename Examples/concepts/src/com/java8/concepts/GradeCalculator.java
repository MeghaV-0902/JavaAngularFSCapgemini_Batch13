package com.java8.concepts;
interface Hireable
{
    boolean HiringCriteria(int mmarks, String grade);
}

class FacebookHR implements Hireable
{
    @Override
    public boolean HiringCriteria(int mmarks, String grade)
    {

        if(mmarks>70 && (grade=="A"||grade=="B"||grade=="C"))
        {
            //System.out.println(grade);
            return true;
        }
        else
        {
           // System.out.println(grade);
            return false;
        }

    }
}
class MicrosoftHR implements Hireable
{
    @Override
    public boolean HiringCriteria(int mmarks, String grade)
    {

        if(mmarks>=90 && (grade=="A"||grade=="B"))
        {
            //System.out.println(grade);
            return true;
        }
        else
        {
            // System.out.println(grade);
            return false;
        }

    }
}
class GoogleHR implements Hireable
{
    @Override
    public boolean HiringCriteria(int mmarks, String grade)
    {
        if(mmarks>80 && (grade=="A"||grade=="B"))
        {
            //System.out.println(grade);
            return true;
        }
        else
            return false;
    }
}
class StudentDetails
{
    int id;
    String name;
    int cmarks;
    int pmarks;
    int mmarks;

    StudentDetails(int id, String name, int cmarks, int pmarks, int mmarks)
    {
        this.id=id;
        this.name=name;
        this.cmarks=cmarks;
        this.pmarks=pmarks;
        this.mmarks=mmarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCmarks() {
        return cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public int average()
    {
        int avg= (this.cmarks+this.mmarks+this.pmarks)/3;
        return avg;
    }


}

public class GradeCalculator
{
    public static String getGrade(StudentDetails student)
    {
        String grade;
        if (student.average()>90 && student.average()<=100)
        {
            return "A";
        }
        else if(student.average()>80 && student.average()<=90)
        {
            return"B";
        }
        else if(student.average()>70 && student.average()<=80)
        {
            return"C";
        }
        else
            return "F";


    }
    public static void display(StudentDetails[] students)
    {
      int len=students.length;
      for(int i =0;i<len;i++)
      {if(students[i]!=null)
      {
          System.out.println(students[i].getName());
      }
      }
    }
    public static void main(String args[])
    {
        StudentDetails studentDetails1= new StudentDetails(101,"Raj",90,90,90);
        StudentDetails studentDetails2= new StudentDetails(102,"Rajesh",80,80,80);
        StudentDetails studentDetails3= new StudentDetails(102,"Suraj",92,95,91);
        StudentDetails studentDetails4= new StudentDetails(101,"Tom",85,85,85);

        StudentDetails[] students = new StudentDetails[4];
        students[0]=studentDetails1;
        students[1]=studentDetails2;
        students[2]=studentDetails3;
        students[3]=studentDetails4;
        StudentDetails[] studentHiredByGoogle = new StudentDetails[4];

        int indexGoogle=0;
        for(int i =0;i<4;i++)
        {
            String grade = getGrade(students[i]);
            int marks=students[i].getMmarks();
            GoogleHR g = new GoogleHR();
            boolean result = g.HiringCriteria(marks,grade);
            if(result==true)
            {
                studentHiredByGoogle[indexGoogle]=students[i];
                indexGoogle++;
            }
        }
        StudentDetails[] studentHiredByFacebook = new StudentDetails[4];
        int indexFacebook=0;
        for(int i =0;i<4;i++)
        {
            String grade = getGrade(students[i]);
            int marks=students[i].getMmarks();
            FacebookHR f = new FacebookHR();
            boolean result = f.HiringCriteria(marks,grade);
            if(result==true)
            {
                studentHiredByFacebook[indexFacebook]=students[i];
                indexFacebook++;
            }
        }
        System.out.println("Students hired by Facebook: ");
        display(studentHiredByFacebook);
        System.out.println("Students hired by Google: ");
        display(studentHiredByGoogle);

    }

}