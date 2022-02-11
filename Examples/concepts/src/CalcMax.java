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

public class CalcMax
{
    public static StudentDetails getMaxStudentPercentage(StudentDetails[] student)
    {
        int len= student.length;
        int index=0;
        int max = student[0].average();

        for(int i =0;i<len;i++)
        {
            if(max<student[i].average())
            {
                max=student[i].average();
                index=i;
            }
        }
        return student[index];
    }
    public static void main(String args[])
    {
        StudentDetails studentDetails1= new StudentDetails(101,"Raj",45,65,75);
        StudentDetails studentDetails2= new StudentDetails(102,"Rajesh",55,70,75);
        StudentDetails studentDetails3= new StudentDetails(102,"Suraj",46,66,75);
        StudentDetails studentDetails4= new StudentDetails(101,"Tom",40,65,75);

        StudentDetails[] students = new StudentDetails[4];
        students[0]=studentDetails1;
        students[1]=studentDetails2;
        students[2]=studentDetails3;
        students[3]=studentDetails4;


        StudentDetails StudentWithMaxPercent = getMaxStudentPercentage(students);

        int MaxAvg= StudentWithMaxPercent.average();

        System.out.println("name: "+ StudentWithMaxPercent.getName()+" marks: "+MaxAvg);


    }

}