
interface Hireable
{
    boolean HiringCriteria(int mmarks, String grade);
}

class FacebookHR implements Hireable
{
    @Override
    public boolean HiringCriteria(int mmarks, String grade)
    {

        if(mmarks>60 && (grade=="A"||grade=="B"||grade=="C"))
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
        if(mmarks>=90 && (grade=="A"||grade=="B"))
        {
            //System.out.println(grade);
            return true;
        }
        else
            return false;
    }
}
class StudentsDetails
{
    int id;
    String name;
    int cmarks;
    int pmarks;
    int mmarks;

    StudentsDetails(int id, String name, int cmarks, int pmarks, int mmarks)
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

public class GradeCalculator1
{
    public static String getGrade(StudentsDetails student)
    {
        String grade;
        if (student.average()>=90 && student.average()<=100)
        {
            return "A";
        }
        else if(student.average()>=80 && student.average()<90)
        {
            return"B";
        }
        else if(student.average()>=70 && student.average()<80)
        {
            return"C";
        }
        else if(student.average()>=60 && student.average()<70)
        {
            return"D";
        }
        else
            return "F";


    }
    public static void display(StudentsDetails[] students)
    {
        int len=students.length;
        for(int i =0;i<len;i++)
        {if(students[i]!=null)
        {
            System.out.println(students[i].getName());
        }
        }
    }

    public static StudentsDetails[] HiredByFacebook(StudentsDetails[] students)
    {
        StudentsDetails[] studentHiredByFacebook = new StudentsDetails[4];
        int indexFacebook=0;
        for(int i =0;i<4;i++)
        {
            String grade = getGrade(students[i]);
            int marks=students[i].getMmarks();
            FacebookHR f = new FacebookHR();
            boolean result = f.HiringCriteria(marks,grade);
            if(result==true)
            {
               // System.out.println("facebook"+students[i].getName()+" "+students[i].getMmarks()+" "+grade);
                studentHiredByFacebook[indexFacebook]=students[i];
                indexFacebook++;
            }
        }
        return studentHiredByFacebook;
    }

    public static StudentsDetails[] HiredByGoogle(StudentsDetails[] students)
    {
        StudentsDetails[] studentHiredByGoogle = new StudentsDetails[4];
        int indexGoogle=0;
        for(int i =0;i<4;i++)
        {
            String grade = getGrade(students[i]);
            int marks=students[i].getMmarks();
            GoogleHR g = new GoogleHR();
            boolean result = g.HiringCriteria(marks,grade);
            if(result==true)
            {
                //System.out.println("Google"+students[i].getName()+" "+students[i].getMmarks()+" "+grade);
                studentHiredByGoogle[indexGoogle]=students[i];
                indexGoogle++;
            }
        }
        return studentHiredByGoogle;
    }
    public static void main(String args[])
    {
        StudentsDetails studentDetails1= new StudentsDetails(101,"Raj",90,90,90);
        StudentsDetails studentDetails2= new StudentsDetails(102,"Rajesh",80,80,80);
        StudentsDetails studentDetails3= new StudentsDetails(102,"Suraj",70,70,70);
        StudentsDetails studentDetails4= new StudentsDetails(101,"Tom",50,50,50);

        StudentsDetails[] students = new StudentsDetails[4];
        students[0]=studentDetails1;
        students[1]=studentDetails2;
        students[2]=studentDetails3;
        students[3]=studentDetails4;
       // StudentsDetails[] studentHiredByGoogle = new StudentsDetails[4];

        System.out.println("Students hired by facebook: ");
        StudentsDetails[] facebookRecruits= HiredByFacebook(students);
        display(facebookRecruits);
       // StudentsDetails[] studentHiredByFacebook = new StudentsDetails[4];
        StudentsDetails[] googleRecruits = HiredByGoogle(students);
        System.out.println("Students Hired by Google");
        display(googleRecruits);


    }

}