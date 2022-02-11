class Students
{   //class containing details of students
    private int id;
    private String name;

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

    Students(int id, String name)
    {
        this.id=id;
        this.name=name;
    }



}


public class SortingStudents
{
    public static Students[] SortTheStudentsBasedOnName(Students[] students)
    {
        //sorting the students based on ID using bubble sort
        String name=students[0].getName();
        int n = students.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (students[j].getName().compareTo(students[j+1].getName())<0)
                {
                    // swap arr[j+1] and arr[j]
                    int temp = students[j].getId();
                    String tempName = students[j].getName();
                    students[j].setId(students[j+1].getId());
                    students[j].setName(students[j+1].getName());
                    students[j+1].setId(temp);
                    students[j+1].setName(tempName);
                }

        return students;
    }
    public static Students[] SortTheStudentsBasedOnID(Students[] students)
    {
        //sorting the students based on ID using bubble sort
        int id=students[0].getId();
        int n = students.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (students[j].getId() > students[j+1].getId())
                {
                    // swap arr[j+1] and arr[j]
                    int temp = students[j].getId();
                    String tempName = students[j].getName();
                    students[j].setId(students[j+1].getId());
                    students[j].setName(students[j+1].getName());
                    students[j+1].setId(temp);
                    students[j+1].setName(tempName);
                }

        return students;
    }
    public static void main(String args[])
    {
        Students students1=new Students(101,"Raj");
        Students students2=new Students(104,"Tom");
        Students students3=new Students(103,"Suraj");
        Students students4=new Students(102,"Rajesh");


        Students[] studentArray = new Students[4];

        studentArray[0] = students1;
        studentArray[1] = students2;
        studentArray[2] = students3;
        studentArray[3] = students4;

        //collecting all the students sorted based on ID
        Students[] sortedStudents = SortTheStudentsBasedOnID(studentArray);
        System.out.println("Sorting students based on ID");
        for(int i = 0 ; i<4;i++)
        {
            System.out.println("ID: "+sortedStudents[i].getId()+" Name: "+sortedStudents[i].getName());
        }

        System.out.println("Sorting students based on Name");
        Students[] sortedStudents2 = SortTheStudentsBasedOnID(studentArray);

        for(int i = 0 ; i<4;i++)
        {
            System.out.println("Name: "+sortedStudents2[i].getName()+" ID: "+sortedStudents2[i].getId());
        }

    }

}

