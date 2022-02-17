import java.sql.SQLOutput;

class People {
    private String firstName;
    private String SecondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age <= 19)
            return true;
        return false;
    }

    public String getFullname() {
        String fn;
        if (this.firstName.isEmpty())
            return this.SecondName;
        else if (this.SecondName.isEmpty())
            return this.firstName;
        else if (this.SecondName.isEmpty() && this.firstName.isEmpty())
            return "";
        else
            fn = this.firstName + " " + this.SecondName;
        return fn;
    }
}
public class Person
{
    public static void main(String[] args)
    {
        People p = new People();
        p.setFirstName("");   // firstName is set to empty string
        p.setSecondName("");    // lastName is set to empty string
        p.setAge(10);
        System.out.println("fullName= " + p.getFullname());
        System.out.println("teen= " + p.isTeen());
        p.setFirstName("John");    // firstName is set to John
        p.setAge(18);
        System.out.println("fullName= " + p.getFullname());
        System.out.println("teen= " + p.isTeen());
        p.setSecondName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + p.getFullname());


    }
}

