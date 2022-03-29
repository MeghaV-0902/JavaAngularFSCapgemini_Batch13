package com.question6;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Source
{
    public static void main(String[] args) {
        List<Candidate> list= new ArrayList<>();
        list.add(new Candidate(111, "Jiya Brein", 22, "Female", "HR", 2011, 25000.0));
        list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));

        System.out.println(Implementation.getCount(list));
        System.out.println(Implementation.getAverageAge(list));
        System.out.println(Implementation.countCandidatesDepartmentWise(list));
        System.out.println(Implementation.getYoungestCandidateDetails(list));

    }
}
class Candidate {
    private String name;
    private int id;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Candidatedatamembers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

}
class Implementation
{

    static Map<String, Long> getCount(List<Candidate> list)
    {
     long female=0;
     long male=0;

     for(Candidate c: list)
     {
         if(c.getGender().toLowerCase().equals("female"))
             female++;
         else
             male++;
     }

     Map<String,Long> countList = new HashMap<>();
     countList.put("Male",male);
     countList.put("Female",female);

     countList = list.stream().collect(Collectors.groupingBy(i->i.getGender(), Collectors.counting()));
     return countList;
    }
    static Map<String, Double> getAverageAge(List<Candidate> list)
    {
        int female=0;
        int male=0;
        int cf=0;
        int cm=0;
        double avgf=0;
        double avgm=0;
        Map<String,Double> avgAge = new HashMap<>();
        for(Candidate c: list)
        {
            if(c.getGender().toLowerCase().equals("female")) {
                female=c.getAge()+female;
                cf+=1;
            }
            else
                male=c.getAge()+male;
            cm+=1;
        }

        try {
            avgf=female/cf;
        }catch(ArithmeticException e)
        {
            avgf=female;
        }
        try {
            avgm=male/cm;
        }catch(ArithmeticException e)
        {
            avgm=(double)male;
        }
        if(avgm==0.0) {
            avgAge.put("Male", null);
            avgAge.put("Female",avgf);
        }
        else if(avgf==0.0) {
            avgAge.put("Male",avgm);
            avgAge.put("Female", null);
        }
        else
        {
            avgAge.put("Female",avgf);
            avgAge.put("Male",avgm);

        }

        // avgAge=list.stream().collect(Collectors.groupingBy(i-> i.getGender(), Collectors.averagingDouble(p->p.getAge())));
        return avgAge;
    }

    static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list)
    {
        Map<String,Long> countList = new HashMap<>();
        for(Candidate c: list)
        {
            if(countList.keySet().contains(c.getDepartment()))
            {
                long val = countList.get(c.getDepartment())+1;
                countList.put(c.getDepartment(),val);
            }
            else
            {
                countList.put(c.getDepartment(),1l);
            }
        }


        countList = list.stream().collect(Collectors.groupingBy(i->i.getDepartment(), Collectors.counting()));
        return countList;
    }
    static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
    {
        return list.stream().filter(d->d.getDepartment()=="Product Development").min(Comparator.comparingInt(i->i.getAge()));





    }
}