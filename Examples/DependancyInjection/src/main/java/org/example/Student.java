package org.example;

public class Student
{
    private int studentId;
    private String studentName;
    private String studentAddress;

    //contructor for constructor injection
    public Student(int studentId, String studentName, String studentAddress) {
       System.out.println("constructor 1");
        this.studentId = studentId;
        this.studentName=studentName;
        this.studentAddress = studentAddress;
    }
    public Student(String studentId, String studentName, String studentAddress) {
        System.out.println("constructor 2");
        this.studentId = Integer.parseInt(studentId);
        this.studentName=studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();

    }

    //getter setters for setter injection
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }


    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentDetails=" + studentName + ", studentAddress="
                + studentAddress + "]";
    }




}
