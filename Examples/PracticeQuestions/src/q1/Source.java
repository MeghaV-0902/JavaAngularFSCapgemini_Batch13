package q1;
import java.util.*;
import java.lang.*;
import java.util.regex.*;
class Employee{
    String empName;
    String empID;
    String empDept;
    int salary;
    public Employee(String empName,String empID,String empDept,int salary)
    {
        this.empName=empName;
        this.empID=empID;
        this.empDept=empDept;
        this.salary=salary;
    }
}
class EmployeeDetails{
    public Employee getEmployeeInfo(String str){
        String[] x=str.split("ID");
        String[] y=x[0].split("\\.");
        String name=y[0]+" "+y[1];

        y=x[1].split("DT");
        String id=y[0];

        x=str.split("DT");
        y=x[1].split("CTC");
        String dept=y[0];
        String sal=y[1];

        x=sal.split("L");
        int salary=Integer.parseInt(x[0]);
        salary=salary*100000;
        System.out.println(name);
        System.out.println(id);
        System.out.println(dept);
        System.out.println(salary);
        Employee e = new Employee(name,id,dept,salary);
        return e;
    }
    public String getEmployeeTaxSlab(Employee e){
        if(e.salary>1000000)
            return "High";
        else if(e.salary>=800000 && e.salary<=1000000)
            return "Medium";
        else if(e.salary>=500000 && e.salary<800000)
            return "Low";
        else if(e.salary<500000)
            return "None";
        return "";
    }

}
public class Source {
    public static void main(String[] args) {
        EmployeeDetails obj=new EmployeeDetails();
        Employee emp=obj.getEmployeeInfo("Jimmy.RyanIDIE22IT023DTITCTC8L");
        System.out.println(emp.empName+" "+emp.empID+" "+emp.empDept+" "+emp.salary);
        System.out.println(obj.getEmployeeTaxSlab(emp));
    }
}