package com.question5;
import java.util.*;
public class Source
{
    public static void main(String[] args)
    {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Mickey", 100000));
        emps.add(new Employee("Timmy", 50000));
        emps.add(new Employee("Annny", 40000));
        //System.out.println(emps);
        EmployeeInfo i = new EmployeeInfo();
        System.out.println(i.sort(emps, EmployeeInfo.SortMethod.BYNAME));
        System.out.println(i.sort(emps, EmployeeInfo.SortMethod.BYSALARY));
        System.out.println(i.isCharacterPresentInAllNames(emps,"2E"));
    }

}
class Employee
{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeInfo
{
    enum SortMethod
    {
        BYNAME,
        BYSALARY;
    }

    public List<Employee> sort(List<Employee> emps, final SortMethod method)
    {


        if(method.equals(SortMethod.BYNAME))
        {
            //System.out.println(method);
            Collections.sort(emps, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if(o1.getName().compareTo(o2.getName())==0)
                    {
                        if(o1.getSalary()>o2.getSalary()) {
                            return 1;
                        }
                        else if(o1.getSalary()< o2.getSalary())
                            return -1;
                        else
                            return 0;
                    }


                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        if(method.equals(SortMethod.BYSALARY))
        {
            //System.out.println(method);
            Collections.sort(emps, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if(o1.getSalary()==o2.getSalary())
                    {
                        if(o1.getName().compareTo(o2.getName())>1) {
                            return 1;
                        }
                        else if(o1.getName().compareTo(o2.getName())<1)
                            return -1;
                        else
                            return 0;
                    }
                    else if(o1.getSalary()<o2.getSalary())
                        return 1;
                    else
                        return -1;
                }
            });
        }
        return emps;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character)
    {
        boolean flag = true;
        for(Employee e : entities)
        {
            if(!e.getName().toLowerCase().contains(character.toLowerCase()))
                flag =false;
        }
        return flag;
    }
}